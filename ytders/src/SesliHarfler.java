package sesliHarfleryt20;

public class SesliHarfler {

	public static void main(String[] args) {
		char harf = 'ı';

		switch (harf) {

		case 'A':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'ı':
		case 'o':
		case 'u':
			// Java buyuk kucuk harf duyarlı oldugundan oturu kucuk harfleride case'in
			// içerisine dahil ettim.

			System.out.println("Kalın sesli harf");
			break;
		default:
			System.out.println("ince sesli harf");
		}

	}

}
