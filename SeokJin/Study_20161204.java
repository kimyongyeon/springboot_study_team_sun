package com.java.day01;

import java.util.Scanner;

public class Day01_ex01 {
	static class Summary {
		int x, y;

		static void print() {
			int number = 0;
			Integer number1 = 0;

			for (int i = 1; i <= 10; i++) {
				number += i;
			}
			System.out.println("1 ~ 10 까지 :" + number);
		}
		static void prn(String str){
			System.out.println(str);
		}

		static void sum(int x, int y) {
			prn(x+"+"+y+"="+(x+y));
		}

		static void minus(int x, int y) {
			prn(x+"-"+y+"="+(x-y));
		}

		static void mult(int x, int y) {
			prn(x+"*"+y+"="+(x*y));
		}

		static void division(int x, int y) {
			prn(x+"/"+y+"="+(x/y));
		}
		
		//java 8
	interface Func{
		void newCal(int a, int b);
	}

	}
	static class cal{
		static void cal(){
			Scanner sc = new Scanner(System.in);
			System.out.println("1. + 2. - 3. * 4. /");
			
			String menu = sc.nextLine();
			System.out.println("첫번째 수 : ");
			int num = sc.nextInt();
			System.out.println("두번째 수 : ");
			int num2 = sc.nextInt();
			while(true){
				switch (menu) {
				case "+":
					Summary.sum(num, num2);
					break;
				case "-":
					Summary.minus(num , num2);
					break;
				case "*":
					Summary.mult(num , num2);
					break;
				case "/":
					Summary.division(num , num2);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Summary.print();
		Summary.sum(10, 4);
		Summary.minus(10, 4);
		Summary.mult(10, 4);
		Summary.division(10, 4);
	}

}
