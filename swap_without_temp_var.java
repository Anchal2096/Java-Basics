import java.util.Scanner;
class swap_without_temp_var{
	public static void main(String args[]){
   		double num1 , num2;
		System.out.println("ENTER THE NUMBER TO BE SWAPPED");
		Scanner sc = new Scanner (System.in);
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		System.out.println("BEFORE SWAPPING \n num1 ="+num1+"\n num2 = "+num2);
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("AFTER SWAPPING \n num1 ="+num1+"\n num2 = "+num2);
		}
}