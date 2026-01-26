/**
 * 
 */
package duwit.edu;

import java.util.Scanner;

/**
 * 
 */
public class Lapphuong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Nhap
		System.out.print("Nhap canh: ");
		double canh = sc.nextDouble();
		
		//Tinh
		double theTich = canh * canh * canh;
		
		//Xuat
		System.out.printf("The tich khoi lap phuong: %.2f%n", theTich);
		
		sc.close();
	}

}
