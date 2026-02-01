/**
 * 
 */
package duwit.edu;

import java.util.Scanner;

/**
 * 
 */
public class BaiTap2_BMI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Nhap
		System.out.println("=== TINH CHI SO BMI ===");
		System.out.print("Nhap can nang (kg): ");
		double weight = sc.nextDouble();
		System.out.print("Nhap chieu cao (m): ");
		double height = sc.nextDouble();
		
		//Tinh
		double bmi = weight / (height * height);
		
		//Xuat
		System.out.println("=== KET QUA ===");
		System.out.printf("Can nang: %.1f%n", weight);
		System.out.printf("Chieu cao: %.1f%n", height);
		System.out.printf("Chi so BMI: %.1f%n", bmi);
		
		if(bmi < 18.5) {
			System.out.println("Phan loai: Thieu can");
		} else if (bmi < 25) {
			System.out.println("Phan loai: Binh thuong");
		} else if(bmi < 30) {
			System.out.println("Phan loai: Thua can");
		} else {
			System.out.println("Phan loai: Beo phi");
		}
		
		sc.close();
	}

}
