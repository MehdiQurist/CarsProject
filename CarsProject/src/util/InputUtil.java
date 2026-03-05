	package util;

import java.util.Scanner;

public class InputUtil {

	public static int requireNumber(String title) {
		Scanner sc = new Scanner(System.in);
		System.out.println(title);
		int result = sc.nextInt();
		sc.nextLine(); // Scanner bufferını temizlemek uçun
		return result;
	}

	public static String requireText(String title) {
		Scanner sc = new Scanner(System.in);
		System.out.println(title);
		String result = sc.nextLine();
		return result;
	}

	public static String requireText(String string, String title) {
		Scanner sc = new Scanner(System.in);
		System.out.println(title);
		String result = sc.nextLine();
		return result;
	}

	public static String requireMarka(String string) {
		Scanner sc = new Scanner(System.in);
		System.out.println(string);
		String result = sc.nextLine();
		return result;
	}

	public static String requireRenk(String string) {
		Scanner sc = new Scanner(System.in);
		System.out.println(string);
		String result = sc.nextLine();
		return result;
	}
}