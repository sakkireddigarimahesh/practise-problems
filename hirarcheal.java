class Bicycle {
	int numGears = 3;
	int speed = 100;
  }
  
  class MountainBike extends Bicycle {//aquires characteristics from parent
	int seatHeight = 25;
  }
 class color extends  Bicycle{//aquires characteristics from parent

	String colorName="black";
 }
  class Test {
	public static void main(String[] args) {
	  color mb = new color();
      MountainBike d=new MountainBike();
	  System.out.println("No of gears are " + mb.numGears);
	  System.out.println("speed of bicycle is " + d.speed);
	  System.out.println("seat height is " + d.seatHeight);
	  System.out.println("color of bike is " + mb.colorName);
	}