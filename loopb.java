public class loopb {
    public static void main(String[] args) {
        int i=0;
        while(i<5){
            if (i==2) {
                i++; 
                break;           
            } 
            System.out.println(i);
            i++;
        }
System.out.println("after loop");
    }
}  
