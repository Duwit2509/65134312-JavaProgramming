/**
 * 
 */
package duwit.edu;

import java.util.Scanner;

/**
 * 
 */
public class DIemTrungBinh {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Nhap ho va ten
		System.out.print("Nhap ho va ten sinh vien: ");
		String hoTen = sc.nextLine();
		
		// Nhap diem trung binh
		System.out.print("Nhap diem trung binh: ");
		double diemTB = sc.nextDouble();
		
		System.out.println("Ho va ten: "+ hoTen);
		System.out.println("Diem trung binh: "+ diemTB);
		
		
	}

}
