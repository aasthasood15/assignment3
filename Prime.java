import java.util.Scanner;
class Prime
{
public static void main(String[] arg)
{
Scanner d=new Scanner(System.in);
int n=d.nextInt();
int f=0;
for(int i=2;i<n;i++)
{
if(n%i==0)
{
f++;
break;
}
}
if(f==0)
{
System.out.print(n+"is prime");

}
else
{
System.out.print(n+"is not prime");	
}
}
}