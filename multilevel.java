class Bicycle {
	int numGears = 3;
	int speed = 100;
  }
  
  class MountainBike extends Bicycle {
	int seatHeight = 25;
  }
 class color extends  MountainBike{

	String colorName="black";
 }
  class Test {
	public static void main(String[] args) {
	  color mb = new color();
	  System.out.println("No of gears are " + mb.numGears);
	  System.out.println("speed of bicycle is " + mb.speed);
	  System.out.println("seat height is " + mb.seatHeight);
	  System.out.println("color of bike is " + mb.colorName);
	}
  }