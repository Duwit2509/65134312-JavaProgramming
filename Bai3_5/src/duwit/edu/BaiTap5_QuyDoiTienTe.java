/**
 * 
 */
package duwit.edu;

import java.util.Scanner;

/**
 * 
 */
public class BaiTap5_QuyDoiTienTe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Nhap 
		System.out.print("Nhap so tien USD: ");
		double usd = sc.nextDouble();
		
		//Ty gia
		double tyGia = 23500;
		
		//Quy doi
		double vnd = usd * tyGia;
		
		//Xuat
		System.out.printf("So tien tuong ung: %.0f VND%n", vnd);
		
		sc.close();
	}

}
