class Two extends Thread
{
 int x;
 public void run()
 {
  x=2;
  for(int i=1; i<=10; i++)
  {
   System.out.println("2*"+i+"=" +i*x);
  }
 }
}

class Ten extends Thread
{
 int x;
 public void run()
 {
  x=10;
  for(int i=1; i<=10; i++)
  {
   System.out.println("10*"+i+"=" +i*x);
  }
 }
}

class MultiThreading
{
 public static void main(String[] args)
 {
  Two t2 = new Two();
  Ten t10 = new Ten();
  t2.start();
  t10.start();
 }
}