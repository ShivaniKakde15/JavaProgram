import java.util.Scanner;
public class MaxMinArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of aaray: ");;
        int size = input.nextInt();

        int[] array=new int[size];
        System.out.println("Enter value of aaray: ");
        for (int i=0; i<size; i++){
            array[i]=input.nextInt();
        }

        int max = array[0];
        int min = array[0];

        for (int i=1; i<size; i++){
            if (array[i]>max){
                max=array[i];
            }
            if (array[i]<min){
                max=array[i];
            }
        }
        System.out.println("The max value in array is: "+max);
        System.out.println("The min value in array is: "+min);
}
}