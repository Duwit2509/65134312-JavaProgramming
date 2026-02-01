/**
 * 
 */
package duwit.edu;

import java.util.Scanner;

/**
 * 
 */
public class BaiTap1_SumTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Nhap
		System.out.print("Nhap so thu nhat: ");
		double a = sc.nextDouble();
		System.out.print("Nhap so thu hai: ");
		double b = sc.nextDouble();
		
		//Tinh
		double sum = a + b;
		System.out.printf("Tong cua hai so la: %.2f%n", sum);
		
		sc.close();
	}

}
