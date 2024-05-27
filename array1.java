import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        int array1[]=new int[5];//for creation of array
        Scanner sc=new Scanner(System.in);
        for( int i=0;i<5;i++)
        {
            System.out.println("enter the marks of an student:"+(i+1));
            array1[i]=sc.nextInt();
        }
        for (int i=0;i<5;i++)
        {
            System.out.print(array1[i]+" ");
        }
    }


    
}
