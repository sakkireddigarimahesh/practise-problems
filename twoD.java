import java.util.Scanner;
public class twoD {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of rows:");
        int  b=s.nextInt();
        System.out.println("Enter the size of columns:");
        int h=s.nextInt();
        int array[][]=new int[b][h];
        Scanner sc= new Scanner(System.in);
        for (int i=0;i<b;i++)
        {
            for(int j=0;j<h;j++){
                System.out.println("please enter element at row:"+(i+1)+"and enter colomn="+(j+1));
                array[i][j]=sc.nextInt();
            }
        }// upto to store matrix data
        for (int i=0;i<b;i++){//for loop to store the row data
            for(int j=0;j<h;j++){//for loop to store c0l data
                System.out.print(array[i][j]+" ");

            }
            System.out.println("");// to print data by line by line
        }
    }

    
}
