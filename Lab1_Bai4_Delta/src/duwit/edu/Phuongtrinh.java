/**
 * 
 */
package duwit.edu;

import java.util.Scanner;

/**
 * 
 */
public class Phuongtrinh {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Nhap he so
		System.out.print("Nhap a: ");
		double a = sc.nextDouble();
		System.out.print("Nhap b: ");
		double b = sc.nextDouble();
		System.out.print("Nhap c: "); 
		double c = sc.nextDouble();
		
		//Tinh
		double delta = b * b - 4 * a * c;
		
		//Xuat
		if(delta >= 0) {
			double canDelta = Math.sqrt(delta);
			System.out.printf("Delta = %.2f%n", delta);
			System.out.printf("Can delta = %.2f%n", canDelta);
		}
		else {
			System.out.printf("Delta = %.2f%n", delta);
			System.out.printf("Delta am, khong co can bac hai thuc");
		}
		
		sc.close();
		
	}

}
