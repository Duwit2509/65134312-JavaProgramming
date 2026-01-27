/**
 * 
 */
package duwit.edu;

/**
 * 
 */
public class BaiTap4_TienDien {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Tinh tien dien theo bac thang:
		 * 0-50 kWh: 1,678 d/kWh
		 * 51-100 kWh: 1,734 d/kWh
		 * 101-200 kWh: 2,014 d/kWh
		 * 201-300 kWh: 2,536 d/kWh
		 * Tren 300 kWh: 2,834 d/kWh
		*/
		
		int soDien = 250;
		double tienDien = 0;
		
		if (soDien <= 50) {
			tienDien = soDien * 1678;
		} else if (soDien <= 100) {
			tienDien = 50 * 1678 + (soDien - 50) * 1734;
		} else if (soDien <= 200) {
			tienDien = 50 * 1678 + 50 * 1734 + (soDien - 100) * 2014;
		} else if (soDien <= 300) {
			tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (soDien - 200) * 2536;
		} else {
			tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (soDien - 300) * 2834;
		}
		
		System.out.println("So dien: " + soDien + " kWh");
		System.out.println("Tien dien: " + tienDien + " dong");
		System.out.println("Tien dien (VND): " + String.format("%,.0f", tienDien) + " d");
	}

}
