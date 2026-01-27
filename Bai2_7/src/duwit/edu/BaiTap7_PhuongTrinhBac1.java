/**
 * 
 */
package duwit.edu;

import java.util.Scanner;

/**
 * 
 */
public class BaiTap7_PhuongTrinhBac1 {

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
		if(a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh vo so nghiem");
			}
			else {
				System.out.println("Phuong trinh vo nghiem");
			}
		}
		else {
			double x = -b / a;
			System.out.printf("Nghiem x: %.2f%n", x);
		}
		
		sc.close();
	}

}
