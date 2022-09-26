
public class main {

	public static void main(String[] args) {
		
		DortIslem dortIslem = new DortIslem(); //hocam bu satır olmadan class çağrılmadan da hatasız çalışıyor neden ?
		int cevap = DortIslem.cıkar(7, 3);
		System.out.println(cevap);
		int cevap2 = DortIslem.carp(7, 3);
		System.out.println(cevap2);
		
		
		
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		
		int sayi1 =10;
		int sayi2 =20;
		sayi2 = sayi1;
		sayi1 =30;
		System.out.println(sayi2);
		
		int[] sayilar1 = new int [] {1,2,3};
		int[] sayilar2 = new int [] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0]=16;
		System.out.println(sayilar2[0]);
		
		
	}
}
