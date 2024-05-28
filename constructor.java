public class constructor{
    int i;
    String j;
    constructor(){

        System.out.println("printing the default with no parameters");
    }
    constructor(int i){
    this.i=i;
    }
    public static void main(String[] args) {
      constructor b =new constructor();
      constructor v = new constructor();
      constructor h= new constructor(45);
    System.out.println(h.i);
    }
}

