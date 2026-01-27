/**
 * 
 */
package duwit.edu;

/**
 * 
 */
public class BaiTap3_BMI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// BMI = can nang (kg) / (chieu cao (m) * chieu cao (m))
		
		double weight = 53.2; //kg
		double height = 1.71; //m
		
		double bmi = weight / (height * height);
		
		System.out.println("Can nang: " + weight + " kg");
		System.out.println("Chieu cao: " + height + " m");
		System.out.println("Chi so BMI: " + bmi);
		
		//Phan loai bmi
		if(bmi < 18.5) {
			System.out.println("Phan loai: Thieu can");
		} else if (bmi < 25) {
			System.out.println("Phan loai: Binh thuong");
		} else if (bmi < 30) {
			System.out.println("Phan loai: Thua can");
		} else {
			System.out.println("Phan loai: Beo phi");
		}
		

	}

}
