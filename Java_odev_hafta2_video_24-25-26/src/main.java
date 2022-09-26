import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
		asalMi();
		asalMi();
		vedaEt("furkan");
		
		String mesaj = "Bugün günlerden cuma.";
		String zort = mesaj.substring(0,2);
		System.out.println(zort);
		int sonuc = topla(5,12);
		System.out.println(sonuc);
		int toplam = topla2(2,3,4,5,6);
		System.out.println(toplam);
	}

public static void asalMi() {
	
	Scanner scan = new Scanner(System.in);
    
    System.out.print("Bir sayi giriniz: ");
    int sayi = scan.nextInt();
    boolean asal = true;
    
    for(int i = 2; i < sayi; i++)
    {
        if(sayi % i == 0) {
        	asal = false;
        }
           
    }
    if (asal){
    	System.out.println(sayi + " Asaldır");
	}
    else {
    	System.out.println(sayi + " Asal değildir");
    }

}
	
public static void vedaEt(String isim) {
	
	System.out.println("Hoşçakal"+ isim);
	
}

public static int topla(int sayi1,int sayi2) {

	return sayi1+sayi2;
	
	}

public static int topla2(int... sayilar) {
	
	int toplam = 0;
	for (int sayi : sayilar) {
		toplam+=sayi;
	}
	
	return toplam;
	}





}
