import java .util.Scanner;
class Rectangle{
	public static void main(String args[]){
		double length,breadth;
		int choice;
		System.out.println("please enter the length of the rectangle");
		Scanner sc = new Scanner(System.in);
		length = sc.nextFloat();
		
		System.out.println("please enter the breadth of the rectangle");
		breadth = sc.nextFloat();

		
		System.out.println("Press 1.Area\n 2.Perimeter");
		choice =sc.nextInt();
		switch(choice){
			case 1:
				Area(length,breadth);
				System.out.println(Area(length,breadth));
				break;
			case 2:
				Perimeter(length,breadth);
				System.out.println(Perimeter(length,breadth));
				break;
			default:
				System.out.println("Please enter a valid choice");
				}
						}
	public static double Area(double l_length,double b_breadth){
		return (l_length*b_breadth);
						   }

	public static double Perimeter(double l_length,double b_breadth){
		return (2*(l_length+b_breadth));
							}
		}