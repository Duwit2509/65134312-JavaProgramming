/**
 * 
 */
package duwit.edu;

import java.util.Scanner;

/**
 * 
 */
public class BaiTap4_TinhTienDien {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Nhap
		System.out.print("Nhap so dien (kWh): ");
		int soDien = sc.nextInt();
		
		double tienDien = 0;
		
		//Tinh
		if(soDien <= 50) {
			tienDien = soDien * 1678;
		} else if(soDien <= 100) {
			tienDien = 50 * 1678 + (soDien - 50) *1734;
		} else if(soDien <= 200) {
			tienDien = 50 * 1678 + 50 * 1734 + (soDien - 100) * 2014;
		} else if(soDien <= 300) {
			tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (soDien - 200) * 2536;
		} else {
			tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (soDien - 300) * 2834;
		}
		
		//Xuat
		System.out.println("So dien: " + soDien + "kWh");
		System.out.printf("Tien dien: %.0f VND%n", tienDien);
	}

}
