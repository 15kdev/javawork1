
public class mukemmelSayi21 {

	public static void main(String[] args) {

		// 6 --> 1,2,3 Mükemmel sayı = kendi bölen sayıların toplamı kendisini veren
		// sayılardır.
		// 28 --> 1,2,4,7,14

		int number = 28;
		int total = 0;

		for (int i = 1; i < number; i++) {

			if (number % i == 0) {

				total = total + i;

			}

		}

		if (total == number) {

			System.out.println("Mükemmel Sayıdır.");

		} else {

			System.out.println("Mükemmel Sayı Değildir.");
		}

	}

}
