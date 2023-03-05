package week1.day1;
public class FibbinocciSeries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum = 0, secondNum= 1, sum=0;
		System.out.println("            FIBBONOCCI SERIES              ");
		System.out.println("*******************************************");
		System.out.println( "The 1st number of Fibbonocci Series is " +firstNum);
		System.out.println( "The 2nd number of Fibbonocci Series is " +secondNum);

		for(int i= 1 ; i<=11 ; i++){			
			sum = firstNum + secondNum ;
			firstNum = secondNum;
			secondNum = sum;
			if(i==1) {
			System.out.println( "The "+(i+2)+"rd number of Fibbonocci Series is " +sum);
			}
			else {
				System.out.println( "The "+(i+2)+"th number of Fibbonocci Series is " +sum);
			}
		}		
	}
}
