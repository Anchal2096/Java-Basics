import java.util.Scanner;
class Factorial{
	public static void main(String args[]){
		int num , factorial = 1;
		num = n;
		System.out.println("ENTER THE NUMBER");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for (int i = 0 ;i <num ;i=i--){
			factorial = factorial*num;
			num =num -1;
		}
		System.out.println("the factorial of "+ n +"is"+factorial);
	}
}