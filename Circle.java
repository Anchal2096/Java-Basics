import java.util.Scanner;
class Circle{
	
	public static void main(String args[]){
		int choice;float radius;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the radius");
		radius = sc.nextInt();
		System.out.println("What would you like to calculate \n 1.Area\n 2.Perimeter");
		choice = sc.nextInt();
		switch (choice){
			case 1 :
				Area(radius);
				break;
			case 2 :
				Perimeter(radius);
				break;
			default :
				System.out.println("ENTER A VALID INPUT");
				}
						}

	public static void Area(float r_radius){
		System.out.println("Area is"+3.14*r_radius*r_radius );
			         }
		
	public static void Perimeter(float r_radius){
		System.out.println("Perimeter is"+3.14*r_radius*2 );
			         }
		
	        }