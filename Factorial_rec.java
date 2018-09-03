import java.util.Scanner;
class Factorial_rec{
	public static void main(String args[]){
		int num,f;
		System.out.println("ENTER THE NUMBER");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		f = Fact(num);
		System.out.println("the factorial of "+ num+"is"+f);
	}
	public static int Fact(int number){
		
		if (number ==1){
		return 1;
		}
		else{
			return Fact(number-1)*number;
		}
			
		
	}
}