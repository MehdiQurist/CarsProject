package util;

import bean.Car;
import bean.Config;

public class CarUtil {

	public static Car FilterCar() {
		String marka = MenuUtil.requireMarka("Enter Car Marka");
		String model = MenuUtil.requireModel("Enter Car Model");
		String renk = MenuUtil.requireRenk("Enter Car Renk");
		int age = MenuUtil.requireAge("Enter Car age");
		Car ca = new Car(marka, model, renk, age);
		return ca;
	}

	public static void printAllRegisteredCars() {
		for (int i = 0; i < Config.Cars.length; i++) {
			Car cr = Config.Cars[i];
			System.out.println(cr.toString());
		}
	}

	public static void registerCars() {
		int count = InputUtil.requireNumber("How many cars do you want to register?");
		Config.Cars = new Car[count];
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + ". Register");
			Config.Cars[i] = CarUtil.FilterCar();
		}
		System.out.println("Registration completed successfully");
		printAllRegisteredCars();
	}

	public static void findCarsAndPrint() {
		String text = InputUtil.requireText("Find your Car.");
		Car[] result = findCars(text);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i].toString());
		}
	}

	public static Car[] findCars(String text) {
		int count = 0;
		for (int i = 0; i < Config.Cars.length; i++) {
			Car cr = Config.Cars[i];
			if (cr.getMarka().contains(text) || cr.getModel().contains(text) || cr.getRenk().contains(text)) {
				count++;
			}
		}
		Car[] result = new Car[count];
		int index = 0;
		for (int i = 0; i < Config.Cars.length; i++) {
			Car cr = Config.Cars[i];
			if (cr.getMarka().contains(text) || cr.getModel().contains(text) || cr.getRenk().contains(text)) {
				result[index] = cr;
				index++;
			}
		}
		return result;
	}

	public static void updateCarWithNewObject() {
		CarUtil.printAllRegisteredCars();
		int index = InputUtil.requireNumber("Which car do you want to update? Select car's number:");
		System.out.println("Add new information");
		Car cr = CarUtil.FilterCar();
		Config.Cars[index - 1] = cr;
		MenuUtil.successMessage();
		CarUtil.printAllRegisteredCars();
	}

	public static void updateCarsWithOldObject() {
		CarUtil.printAllRegisteredCars();
		int index = InputUtil.requireNumber("Which car do you want to update? Select car's number:");
		String parameters = InputUtil.requireText("Which information do you want to update? (Marka, Model, Renk, Age)");
		System.out.println("Add new information");
		Car cr = Config.Cars[index - 1];

		if (parameters.contains(" Marka")) {
			cr.setMarka(MenuUtil.requireMarka("Enter car marka:"));
		}
		if (parameters.contains("Model")) {
			cr.setModel(MenuUtil.requireModel("Enter car model:"));
		}
		if (parameters.contains("Renk")) {
			cr.setRenk(MenuUtil.requireRenk("Enter car renk:"));
		}
		if (parameters.contains("Age")) {
			cr.setAge(MenuUtil.requireAge("Enter car age:"));
		}
	}

	public static void deleteCar() {
		// TODO: Implement deleteCar method
		int index = InputUtil.requireNumber("Which car do you want to delete? Select car's number:");
        if (index > 0 && index <= Config.Cars.length) {
            Car[] newCarsArray = new Car[Config.Cars.length - 1];
            int newIndex = 0;
            for (int i = 0; i < Config.Cars.length; i++) {
                if (i != index - 1) {
                    newCarsArray[newIndex] = Config.Cars[i];
                    newIndex++;
                }
            }
            Config.Cars = newCarsArray;
            System.out.println("Car deleted successfully");
        } else {
            System.out.println("Invalid car number. Deletion failed.");
        }
		
	}

	public static void exitProgram() {
		// TODO: Implement exitProgram method
		System.out.println("Exiting the program...");
		System.exit(0);
	}

	public static Car filterCar() {
		// TODO: Implement filterCar method
		return null;
	}

	public static void updateCarWithOldObject() {
		// TODO Auto-generated method stub

	}
}