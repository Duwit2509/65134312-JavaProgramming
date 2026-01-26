/**
 * 
 */
package duwit.edu;

import java.util.Scanner;

/**
 * 
 */
public class Hinhchunhat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Nhap 2 canh
		System.out.print("Nhap canh a: ");
		double a = sc.nextDouble();
		System.out.print("Nhap canh b: ");
		double b = sc.nextDouble();
		
		//Tinh
		double chuVi = (a+b)*2;
		double dienTich = a*b;
		double canhBe = Math.min(a, b);
		
		//Xuat
		System.out.printf("Chu vi hinh chu nhat: %.2f%n", chuVi);
		System.out.printf("Dien tich hinh chu nhat: %.2f%n", dienTich);
		System.out.printf("Canh be hinh chu nhat: %.2f%n", canhBe);
		
		sc.close();
		
		
	}

}
