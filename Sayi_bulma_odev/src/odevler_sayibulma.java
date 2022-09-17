
public class odevler_sayibulma {

	public static void main(String[] args) {
		
		int[] sayilar = new int[] {1,2,5,7,15,0};
		int aranacak = 7;
		
		for (int i = 0; i < sayilar.length; i++) {
			if (aranacak==sayilar[i])
			{
				System.out.println("Sayi mevcut");
			}
			else //bu kısım döngü içinde oldugundan döngü kere tekrar ediliyor ben farklı birşekilde ypamak istedim else bölümü çıkarılabilir.
			{
				System.out.println("Sayi dizide yok");
			}
				
		}

		
		
		
	
	
		
		
    }
}
