/**
 * 
 */
package duwit.edu;

import java.util.Scanner;

/**
 * 
 */
public class BaiTap3_TinhToan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Nhap
		System.out.print("Nhap so a: ");
		double a = sc.nextDouble();
		System.out.print("Nhap so b: ");
		double b = sc.nextDouble();
		
		//Xuat
		System.out.printf("Tong: %.2f%n", a + b);
		System.out.printf("Hieu: %.2f%n", a - b);
		System.out.printf("Tich: %.2f%n", a * b);
		if(b != 0) {
			System.out.printf("Thuong: %.2f%n", a / b);
		}
		else {
			System.out.println("Khong the chia cho 0!");
		}
		
		sc.close();
	}

}
