package com.realworld;

class Bicycle
{
	int gear;
	int speed;
	public Bicycle(int gear, int speed) {
		super();
		this.gear = gear;
		this.speed = speed;
	}
	public void ApplyBrake(int decerment)
	{
		speed-=decerment;
	}
	public void SpeedUp(int increment)
	{
		speed+= increment;
	}
	
	public String DisplayInfo()
	{
		return ("No of Gears are" + gear +"\n Speed of bicycle is"+ speed);
	}
}

class MountainBicycle extends Bicycle
{
   public int startheight;
	public MountainBicycle(int gear, int speed,int startheight) {
		super(gear, speed);
		this.startheight=startheight;
		// TODO Auto-generated constructor stub
	}
	
	public void SetHeight(int seatheight)
	{
		startheight= seatheight;
	}
	
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MountainBicycle mb = new MountainBicycle(10,50, 25);
		 System.out.println(mb.DisplayInfo());
		 mb.ApplyBrake(10);
	   System.out.println(mb.DisplayInfo());
		 
		

	}

}
