class GreatestThree
{
  public static void main(String[ ] args)
{
   int a=10,b=20,c=30;
if(a>b)
{ 
     if(a>c)
     { 
       System.out.println("a is greatest " +a);
     }
     else
     {
       System.out.println("c is greatest " +c);
     }
}
else
{ 
   if(b>c)
    {
       System.out.println("b is greatest " +b);
    }
    else
    {
        System.out.println("c is greatest " +c);
     }
}
}
}