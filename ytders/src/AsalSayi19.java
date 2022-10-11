package yt19MiniProjeAsalSayi;

public class AsalSayi19 {

	public static void main(String[] args) {
		
		//Bug:Açık anlamındadır.1 yazdıgımızda asal verır.fakat 1 asal degıldır.
		int number = 11; // 25 sayisi asal mı degıl mı? Operatör bölümden kalan bulma op.
		int remainder = number % 2;
		// System.out.println(remainder);

		// 1 ve kendinden başka pozitif tam sayı böleni olmayan sayıya asal sayı denir.

		boolean isPrime = true; // isprime asal mı? anlamındadır.
		
		if(number==1) {
			
			System.out.println("Geçersiz Sayı");
			return;
			
		}
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {

				isPrime = false;

			}

		}

		if (isPrime == true) {

			System.out.println("Sayi Asaldır");

		} else {

			System.out.println("Sayı Asal Değildir");
		}

	}

}
