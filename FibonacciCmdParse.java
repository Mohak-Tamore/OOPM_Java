class FibonacciCmdParse
{
 public static void main(String args[])
 {
  int a=0,b=1,c,fib,n;
  n = Integer.parseInt(args[0]);
  for(int i=0; i<=n; i++)
  {
   c=a+b;
   System.out.print(c+" ");
   a=b;
   b=c;
  }
 }
}