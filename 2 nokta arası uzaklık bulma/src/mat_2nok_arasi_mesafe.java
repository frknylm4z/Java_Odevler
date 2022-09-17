import java.util.Scanner;

public class mat_2nok_arasi_mesafe {

	public static void main(String[] args) {
		int A,B;
		double z;
		Scanner scan = new Scanner(System.in); //kullanıcıdan input alabilmek için scan değişkeniyle scanner ekledik
		
		
		// 3-4-5 özel üçgenini test etmek için ilk noktayı -> 0 3 ikinciyi ise -> 4 0 girin 5 hipotenüs cevabını alırsınız
		
		System.out.println("birinci noktanin kordinatini girin ornek : (2,3) için ==> 2 3 \n");
		int x = scan.nextInt(); //kullanıcı ne girerse girsin [string] kabul edileceği için parse vs. kullanmadan nextInt() metodu ile çevirme işlemi yaptık
		int y = scan.nextInt();
		System.out.println("ikinci noktanin kordinatlarini girin\n");	
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		A =x2-x;
		B =y2-y;
		z=(A*A)+(B*B);
		System.out.println("cevap " + Math.sqrt(z)); //math fonksiyonun kare alma metodudur.
		
	}

}
