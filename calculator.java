 import java.util.Scanner;
class calculator
{
public static void main(String args[])
{
new calculator (); 
}
public calculator () 
{
  float a,b,result=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number: ");
 a=sc.nextFloat();
System.out.println("Enter second number: ");
 b=sc.nextFloat(); 
System.out.println("Choose your option....");
System.out.println("\n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division\n\t\t");
int option=sc.nextInt();
System.out.println("\n Your option is =\t"+option);

if(option==1)
{
result=a+b;
System.out.println("\nResult of addition is =\t "+result);
}
else if(option==2)
{
result=a-b;
System.out.println("\nResult of subtraction is =\t "+result);
}
else if(option==3)
{
result=a*b;
System.out.println("\nResult of multiplication is =\t "+result);
}
else if(option==4)
{
result=a/b;
System.out.println("\nResult of division is =\t "+result);
}
else
{ 
System.out.println("Please Choose the number between 1 to 4\n");
}
}
}