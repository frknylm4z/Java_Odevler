import java.util.Scanner;

public class odevler {

	public static void main(String[] args) {
		
		//Asal sayı bulma mini proje ___________________________________________
		
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
}

