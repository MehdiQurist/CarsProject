package main;

import util.InputUtil;
import util.MenuUtil;

public class Main {

	public static void main(String[] args) {
		int m = 0;
		while (true) {
			m = InputUtil.requireNumber("What do you want to do? (Select a menu number)" 
		            + "\n1. Register a car"
					+ "\n2. Show all cars" 
					+ "\n3. Find a car" 
					+ "\n4. Update a car" 
					+ "\n5. Delete a car");
			     

			MenuUtil.showMenu(m);

			
		}
	}
}