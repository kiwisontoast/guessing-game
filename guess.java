import java.util.Scanner;
public class guess
{
	public static void main(String args[])
	{
        int randomNum=0;
        randomNum=(int)(Math.random()*100)+1;
		Scanner scanner = new Scanner(System.in); 
        int num = 0; 
        while
        System.out.println("Guess a number from 1 - 100:");
        int num = scanner.nextInt();
        
		scanner.close();
	}
}