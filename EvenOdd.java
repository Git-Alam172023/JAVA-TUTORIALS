import java.util.Scanner; 
  class EvenOdd
{
     public static void main(String [ ] args)
{ 
    int n;
System.out.println("Enter any number");
Scanner r=new Scanner(System.in);
n=r.nextInt();
   if(n%2==0)
  { 
        System.out.println("Even number");
  }
  else
  {
       
        System.out.println("Odd number");
   }
 }
}