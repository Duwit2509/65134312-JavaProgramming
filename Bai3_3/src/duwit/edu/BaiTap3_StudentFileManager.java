/**
 * 
 */
package duwit.edu;

import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

/**
 * 
 */
public class BaiTap3_StudentFileManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Nhap
		System.out.println("=== NHAP THONG TIN SINH VIEN ===");
		System.out.print("Ma sinh vien: ");
		String id =  sc.nextLine();
		System.out.print("Ho ten: ");
		String name = sc.nextLine();
		System.out.print("Diem Toan: ");
		double math = sc.nextDouble();
		System.out.print("Diem Ly: ");
		double physics = sc.nextDouble();
		System.out.print("Diem Hoa: ");
		double chemistry = sc.nextDouble();
		
		//Tinh
		double average = (math + physics + chemistry) / 3;
		
		//Ghi vao file
		try {
			FileWriter wr = new FileWriter("students.txt", true);
			wr.write("=== SINH VIEN ===\n");
			wr.write("Ma sinh vien: " + id + "\n");
			wr.write("Ho ten: " + name + "\n");
			wr.write(String.format("Diem Toan: %.1f%n", math));
			wr.write(String.format("Diem Ly: %.1f%n", physics));
			wr.write(String.format("Diem Hoa: %.1f%n", chemistry));
			wr.write(String.format("Diem TB: %.2f%n", average));
			wr.write("=======================\n\n");
			wr.close();
			
			System.out.println("\nDa luu thong tin vao file students.txt");
		} catch (IOException e) {
			System.out.println("Loi ghi file: " + e.getMessage());
		}
		
		sc.close();
	}

}
