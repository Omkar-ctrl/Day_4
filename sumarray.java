import java.util.Scanner;

class sumarray{
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
   
    int sum=0;
        int array[]=new int[5];
        System.out.println("Enter a values to add");
        for (int i=0;i<array.length;i++)
        {
            System.err.print("Enter a Number: ");
             array[i]=s.nextInt();
        }
        
        for (int n:array)
        {
         
            sum=sum+n;  
        } 
        System.out.println("The Sum of arrays is: "+sum);
      
  
  
  
  
    }
}