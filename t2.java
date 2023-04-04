import java.util.*;

class t2
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the guessing the number game :)");
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int randomnumber = rn.nextInt(100) + 1;
		
		
		while(true){
			System.out.println("Enter your Guess between (1-100):");
			int userguess = sc.nextInt();
			
			if(userguess==randomnumber)
			{
				System.out.println("Congratulations You Win!!!");
				break;
			}
			else if(userguess>randomnumber)
			{
				System.out.println("Try to guess lower than that number");
				//break;
			}
			else
			{
				System.out.println("Try to guess higher than that number");
				//break;
			}
		}
    }
}