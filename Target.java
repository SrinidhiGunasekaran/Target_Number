import java.io.*;
class Target
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
int n,tar,i,j;
n=Integer.parseInt(in.readLine());
int[] a=new int[n];
System.out.println("Numbers:");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(in.readLine());
}
System.out.println("Target:");
tar=Integer.parseInt(in.readLine());
i=0;
while(i<n)
{
for(j=1;j<=n;j++)
{
if((a[i]+a[j])==tar)
{
System.out.println("Integers:"+a[i]+","+a[j]);
}
else
i++;
}
}
}
catch(Exception e)
{
}
}
}
