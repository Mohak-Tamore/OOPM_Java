class FactorialCmdParse
{
 public static void main(String args[])
 {
  int n=0,fact=1,len;
  len = args.length;
  n = Integer.parseInt(args[0]);
  for(int i=1; i<=n; i++)
  {
   fact = fact*(i);
  }
  System.out.print(fact); 
 }
}