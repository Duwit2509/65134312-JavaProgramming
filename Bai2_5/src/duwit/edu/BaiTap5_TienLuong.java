/**
 * 
 */
package duwit.edu;

import java.util.Scanner;

/**
 * 
 */
public class BaiTap5_TienLuong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Nhap
		System.out.print("Nhap so gio lam: ");
		double soGio = sc.nextDouble();
		System.out.print("Nhap luong theo gio: ");
		double luong = sc.nextDouble();
		
		//Tinh
		double tongLuong;
		if (soGio <= 40) {
			tongLuong = soGio * luong;
		} else {
			tongLuong = 40 * luong + (soGio - 40) * luong * 1.5;
		}
		
		//Xuat
		System.out.println("Tong luong: " + tongLuong + " VND");
		System.out.printf("Tong luong (format): %.0f VND%n", tongLuong);
		
		sc.close();
	}

}
