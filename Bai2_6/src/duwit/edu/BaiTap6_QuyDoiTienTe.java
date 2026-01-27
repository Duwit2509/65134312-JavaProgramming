/**
 * 
 */
package duwit.edu;

import java.util.Scanner;

/**
 * 
 */
public class BaiTap6_QuyDoiTienTe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Nhap
		System.out.print("Nhap so tien USD: ");
		double usd = sc.nextDouble();
		System.out.print("Nhap so tien EUR: ");
		double eur = sc.nextDouble();
		
		//Ty gia
		double usdToVnd = 23500;
		double eurToVnd = 27000;
		
		//Quy doi
		double vndFromUsd = usd * usdToVnd;
		double vndFromEur = eur * eurToVnd;
		
		//Xuat
		System.out.printf("USD -> VND: %.0f VND%n", vndFromUsd);
		System.out.printf("EUR -> VND: %.0f VND%n", vndFromEur);		
		sc.close();
		
	}

}
