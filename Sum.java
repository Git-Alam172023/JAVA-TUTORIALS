import java.util.Scanner; 
  class Sum
{
     public static void main(String [ ] args)
{ 
    int n,Sum=0;
System.out.println("Enter no of term");
Scanner r=new Scanner(System.in);
n=r.nextInt();
for(int i=1;i<=n;i++)
{ 
     Sum=Sum+i;     
}
System.out.print("Addition of Entered terms "  +Sum);
}
}