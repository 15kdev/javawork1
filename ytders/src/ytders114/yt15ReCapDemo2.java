package ytders114;

public class yt15ReCapDemo2 {

	public static void main(String[] args) {

		double[] myList1 = { 1.2, 1.3, 4.3, 5.6 };
		double total = 0;
		double max = myList1[0];
		// double [] myList11 =new double[4] ; //satır yedı ve satır dokuz aynı anlamı
		// ıfade eder.

		for (double number : myList1) {

			if (max < number) {
				max = number;

			}
			total = total + number;

			System.out.println(number);
		}
		System.out.println("Toplam = " + total);
		System.out.println("En Büyük = " + max);

	}

}
