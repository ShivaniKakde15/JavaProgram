import java.util.Scanner;

class JavaArray{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int a[]=new int[size];

        
        for(int i=0; i<size; i++){
          System.out.println("Enter the value of array:");
          a[i]=sc.nextInt();
        }
    System.out.println("displayed"); 
        for(int i=0; i<size; i++){
          System.out.println(a[i]+" ");
        }  
    }
}