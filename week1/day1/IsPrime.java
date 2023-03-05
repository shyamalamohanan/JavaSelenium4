package week1.day1;
import java.util.Scanner;
public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to find if its 'Prime' or 'NOT Prime'");
		int n = input.nextInt();
		boolean isPrime=false;
		for(int j=2;j<=n-1;j++){
			if(n%j==0){
				isPrime=false;
				break;
				}
			isPrime=true;
		}
		if(isPrime){
			System.out.println("The given number " +n+ " is Prime.");
		}
		else{
			System.out.println("The given number " +n+ " is NOT Prime.");
		}
	}
}
