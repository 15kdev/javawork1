package ytders114;

public class StringsDemoYT17 {

	public static void main(String[] args) {
		
	String mesaj = "  Bugün hava çok güzel.  ";
	System.out.println(mesaj);
	/*
	System.out.println("Eleman Sayısı :"+ mesaj.length());
	System.out.println( "5. Eleman:" + mesaj.charAt(6) );
	                                                     //charat dizideki belli karakterdekini bulmak.

	System.out.println(mesaj.concat(" Yaşasın!"));
	System.out.println(mesaj.startsWith("A"));
	System.out.println(mesaj.endsWith("."));
	char[] karakterler = new char[5];
	
	mesaj.getChars(0, 5, karakterler, 0);
	System.out.println(karakterler);
	
	///Yogun kullanılan bir fonk.
	
	System.out.println(mesaj.indexOf('a'));
	System.out.println(mesaj.lastIndexOf('e')); */
		
		//Yeni fonk replace:değiştirme anlamına gelir tr de.ingilizce karakterlerin tr ye çev.
		
	    String yeniMesaj = mesaj.replace(' ', '-');
	
		System.out.println(yeniMesaj);       //Yogun olarak kullanılır replace.
		
		System.out.println(mesaj.substring(2)); //2.indexten itibaren kes demektir.
		
		System.out.println(mesaj.substring(2,5)); //kes yansıt demek.
		
		for (String kelime : mesaj.split("")) {    //kelimeleri alt alta yaz
			
			System.out.println(kelime);
			
			
		}
		
		System.out.println(mesaj.toLowerCase());    //kucuk harfe cevir demek
		System.out.println(mesaj.toUpperCase());    //Büyük harfe cevir.Veri tabanlarına arama için kullanılır.
		
		
		System.out.println(mesaj.trim());  //boslukları kes anlamında kullanılır. başında sonunda bosluklar atılır.
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
