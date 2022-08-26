package com.bilgeadam.boost.week02.lesson001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		ShapeTest shapeTest = new ShapeTest();
		shapeTest.readInput();
		System.out.println("Bye...");
	}

	private void readInput() {
		int count = 0;
		boolean more = true;
		
		ArrayList<Double> myList = new ArrayList<Double>();
		
		while (more) {

			System.out.println(
					"Lutfen hesaplamak istediginiz seklin uzunluklarini giriniz (max 4) (-1 ile cikis yapabilirsiniz):  ");
			// For loop ile 3 veya 4 kenar girilmesi gerektigini söylüyoruz//		
			
			for (int i = 1; i < 5; i++) {
				System.out.println("Lutfen diger kenar uzunlugunu giriniz(" + i + ")(0 ile sonlandiriniz)");
				Scanner scan = new Scanner(System.in);
				double length = scan.nextDouble();
				myList.add(length);

				if (length == 0) {
					if (i<4) 
						System.out.println("--------------2 ya da daha az kenarli olamaz--------------");
					break;
					
					
				}
				
				else if (length ==-1) {
					more = false;
					break;
				}
				else if (i ==3 || i==4) {
					count++;
					System.out.println(count +"."+"Alan" +" = "+ area(myList));
				    System.out.println(count +"." +"Cevre" +" = " + circum(myList));
				}
				
				

			}
		}
	}

	private double circum(ArrayList<Double> myList) {
		Scanner scan = new Scanner(System.in);
		double a = myList.get(0);
		double b = myList.get(1);;
		double c = myList.get(2);;
		double d = 0;
		if (myList.size() == 4) 
	    d = myList.get(3);
		return  a+b+c+d;
		
	}

	private double area(ArrayList<Double> myList) {
		Scanner scan = new Scanner(System.in);
		double a = myList.get(0);
		double b = myList.get(1);;
		double c = myList.get(2);;
		double d = 1;
		if (myList.size() == 4) 
	    d = myList.get(3);
		return a*b*c*d;
		
		
		
	}
}
