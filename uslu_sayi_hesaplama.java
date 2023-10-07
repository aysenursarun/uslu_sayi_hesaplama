package uslu_sayi_hesaplama;

import java.util.Scanner;

public class uslu_sayi_hesaplama {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Üssü alınacak sayı girin: ");
		int sayi1 = scan.nextInt();

		System.out.println("üssü girin: ");
		int sayi2 = scan.nextInt();

		int sonuc = 1;

		// 3*3*3*3*3=

		for (int i = 1; i <= sayi2; i++) {
			sonuc *= sayi1;

		}

		System.out.println(sonuc);
	}

}
