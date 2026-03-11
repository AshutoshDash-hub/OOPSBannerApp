class Age{
	public static void main(String[] args){
		int x = 2024;
		int y = 2000;
		int diff = x-y;
		System.out.println("Harry's age in 2024 is " +diff);//24
	}
}
class Marks{
	public statc void main(Strings[] args){
		int subjects = 3;
		int maths = 94;
		int physics = 95;
		int chemistry = 96;
		int avg = maths + physics + chemistry/subjects;
		System.out.println("Sam's average mark in PCM is " +avg);//95
	}
}
class distance{
	public static void main(String[] args){
		float distance = 10.8;
		float miles = 1.6*distance;
		System.out.println("The distance"+distance+" km in miles is "+miles);
	}
}

class Calculator
{
  public static void main(String[] args)
{ java.util.Scanner sc = new java.util.Scanner(System.in);
  System.out.println("Please enter number 1 ");
  int num1 = sc.newInt();
  Sytem.out.println("Please enter number 2");
  int num2 = sc.newInt();
  int add = num1 +num2;
  int sub = num1 - num2;
  int mul = num1 * num2;
  int div = num1 / num2;
  int mod = num1 % num2;
  
  System.out.println("Addition = " +add);
 System.out.println(" Subtraction = " +sub);
 System.out.println(" Multiplication = "+mul);
 System.out.println(" Divison = "+div);
 System.out.println(" Modulus = " +mod);
}

class Area{
	public static void main(Strings[] args){
	 java.util.Scanner sc = new java.util.Scanner(System.in);
	 System.out.println("Enter Base measure");
     float Base = sc.newfloat();
	 System.out.println("Enter Height measure");
	 float height = sc.newfloat();
	 float Area(sq) = 1/2*base*height;
	 floatC Area(sq cm) = Area(sq)*2.54;
	 System.out.println("The Area of Triangle in sq in is"+ Area(sq)+"sq cm is "+Area(sq cm));
	 
	}
}
class Temperature{
	public staic void main(Strings[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Please enter the tempertaure in Celsius");
		float Celsius = sc.newfloat();
		float FahrenheitResult = (Celsius * 9/5) + 32;
		System.out.println("The"+Celsius+" is "+FahrenheitResult+"celsius");
	}
}
