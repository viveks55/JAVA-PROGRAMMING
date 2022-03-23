import java.util.*;
class MatrixAdd
{
 public static void main(String[] args)
  {
    int a[][]=new int[5][5];
    int b[][]=new int[5][5];
    int c[][]=new int[5][5];
    int i,j;
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter first Matrix");
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
       {
         a[i][j]=s1.nextInt();
    }
       }
System.out.println("Enter Second Matrix");
for(i=0;i<3;i++)
{
  for(j=0;j<3;j++)
  {  
    b[i][j]=s1.nextInt();
  }
}
System.out.println("Matrix after Addition is ;");
 for(i=0;i<3;i++)
 {
  for(j=0;j<3;j++)
   {
     c[i][j]= ;
     System.out.println("\t"+c[i][j]);
   }
 }
}
}
  


