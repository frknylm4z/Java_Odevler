
public class odevler_mukosayi {

	public static void main(String[] args) {
		
		int number1 =28;
		int number2 =7;
		int total = 0;
		
		for (int i = 1; i < number1; i++) 
		{
			if(number1 % i ==0) 
			{
				total += i;
			}
		}
		
		if (total == number1){
        	System.out.println("Mükemmel sayidir");
		}
        else {
        	System.out.println("Mükemmel değildir");
        }
		
		
	}
}
