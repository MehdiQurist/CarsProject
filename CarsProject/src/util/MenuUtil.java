package util;

import bean.Car;

public class MenuUtil {

	public static void showMenu(int selectedMenu) {
		// TODO: Implement menu functionality
		if (selectedMenu == 1) {
			CarUtil.registerCars();
		} else if (selectedMenu == 2) {
			CarUtil.printAllRegisteredCars();
		} else if (selectedMenu == 3) {
			CarUtil.findCarsAndPrint();
		} else if (selectedMenu == 4) {
			CarUtil.updateCarsWithOldObject();
		} else if (selectedMenu == 5) {
			CarUtil.deleteCar();
		} else if (selectedMenu == 6) {
			CarUtil.exitProgram();
		}
	}

	public static void successMessage() {
		System.out.println("Operation completed successfully.");
	}

	public static String requireMarka(String message) {
		return InputUtil.requireText(message);
	}

	public static String requireModel(String message) {
		return InputUtil.requireText(message);
	}

	public static String requireRenk(String message) {
		return InputUtil.requireText(message);
	}

	public static int requireAge(String message) {
		return InputUtil.requireNumber(message);
	}
}