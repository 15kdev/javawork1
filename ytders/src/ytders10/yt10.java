package ytders10;

public class yt10 {

	public static void main(String[] args) {
		// swtich blokları if e göre çok daha az kullanılır.

		char grade = 'F';

		switch (grade) {

		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;

		case 'B':
			System.out.println("Çok güzel : Geçtiniz");
			break;

		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;

		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;

		case 'F':
			System.out.println("Üzgünüz : Kaldınız");
			break;
		// default kullanıcı atanan notlardan farklı bir not girerse.

		default:
			System.out.println("Geçersiz Not Girdiniz");
		}

	}

}
