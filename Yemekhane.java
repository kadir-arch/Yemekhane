import java.util.Scanner;

public class Yemekhane {
	int fiyat = 0;
	String yemekListesi = "1) Sal�al� Makarna = 10\n2) Mercimek �orbas� = 8\n3) Tarhana �orbas� = 8\n4) Elma = 3\n5) Su = 2";

	public Yemekhane(Uyeler uye) {
		ilk: while (true) {
			System.out.print("1) Yemek Listesi\n2) Bakiye Y�kle\n3) Bakiye Sorgula\n> ");
			Scanner scan = new Scanner(System.in);
			int secim = scan.nextInt();

			if (secim == 1) {
				System.out.println(yemekListesi);
				dongu: while (true) {
					System.out.print("Sat�n al�m i�lemini tamamlamak i�in 9, iptal etmek i�in 0 giriniz.\n> ");
					Scanner scan1 = new Scanner(System.in);
					int secim1 = scan.nextInt();
					switch (secim1) {
					case 1: {
						fiyat += 10;
						System.out.println("Yemek Eklendi!");
						break;
					}
					case 2: {
						fiyat += 8;
						System.out.println("Yemek Eklendi!");
						break;
					}
					case 3: {
						fiyat += 8;
						System.out.println("Yemek Eklendi!");
						break;
					}
					case 4: {
						fiyat += 3;
						System.out.println("Yemek Eklendi!");
						break;
					}
					case 5: {
						fiyat += 2;
						System.out.println("Yemek Eklendi!");
						break;
					}
					case 9: {
						if (fiyat <= uye.bakiye) {
							uye.bakiye -= fiyat;
							System.out.println("Sat�n Alma Ba�ar�l�!\nG�ncel Bakiye = " + uye.bakiye);
						} else {
							System.out.println("Bakiye Yetersiz!");
						}
						break ilk;
					}
					case 0: {
						System.out.println("iptal edildi!");
						fiyat = 0;
						break ilk;
					}

					default:
						System.out.println("Se�enekler D���nda Se�im Yapamazs�n�z!");
					}
				}

			} else if (secim == 2) {
				System.out.print("Y�klemek �stedi�iniz Miktar: ");
				Scanner scan2 = new Scanner(System.in);
				int sonuc = scan2.nextInt();
				if (!scan2.hasNextInt()) {
					System.out.println("Sadece integer bir say� girebilirsiniz!");
				} else if (sonuc > 0) {
					uye.bakiyeEkle(sonuc);
				} else {
					System.out.println("Hata var!");
				}

			} else if (secim == 3) {
				System.out.println(String.format("G�ncel Bakiye: ", uye.bakiye));

			} else if (!scan.hasNextInt()) {
				System.out.println("Sadece integer bir say� girebilirsiniz!");
			} else {
				System.out.println("Se�enekler d���nda se�im yapamazs�n�z!");
			}
		}
	}

}
