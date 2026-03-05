package bean;

import util.InputUtil;
import util.MenuUtil;

public class Car {

	private String marka;
	private String model;
	private String renk;
	private int age;

	public Car() {
	}

	public Car(String marka, String model, String renk, int age) {
		this.marka = marka;
		this.model = model;
		this.renk = renk;
		this.age = age;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "car [marka" + marka + ", model=" + model + ", renk" + renk + ", age=" + age + "]";
	}

	public void setName(String requireName) {
		// TODO Auto-generated method stub

	}

	public MenuUtil setAge(MenuUtil menutUtil) {
		// TODO Auto-generated method stub
		return null;
	}

}
