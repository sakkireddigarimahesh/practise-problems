import java.util.Scanner;
public class switchc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the i val:");
        int i=sc.nextInt();
        switch(i)
        {
            case 0:
            System.out.println("i is equal to case o");
            break;
             
            case 1:
            System.out.println("i is equal to case 1");
            break;

            case 3:
            System.out.println("i is equal to case 2");
            break;
            default:
            System.out.println("i is not equal to any case");
        }
    }

    private static int nextInt() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nextInt'");
    }
    
}
