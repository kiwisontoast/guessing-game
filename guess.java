import java.util.Scanner;
public class guess
{
	public static void main(String args[])
	{
        int randomNum=0;
        randomNum=(int)(Math.random()*100)+1;
		Scanner scanner = new Scanner(System.in); 
        int num = 0; 
        while(num!=randomNum){
        System.out.println("Guess a number from 1 - 100:");
        num = scanner.nextInt();
        if(num<randomNum){
            System.out.println("Too low");
        }
        if(num>randomNum){
            System.out.println("Too high");
        }
        }
        System.out.println("That is right");
		scanner.close();
	}
}