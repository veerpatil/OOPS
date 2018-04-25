package com.realworld;

class Box
{
	int height, width, length;

	Box(int height, int width, int length) {
		
		this.height = height;
		this.width = width;
		this.length = length;
	}

	Box() {
		
		height =width= length=0 ;
		
	} 
	Box(int len)
	{
		height =width= length=len ;
	}
	
	double CalculateVolume()
	{
		return height* width* length;
	}
}
public class BoxVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box b = new Box();
		System.out.println("The volme for default box is: "+ b.CalculateVolume());
		
		Box b1 = new Box(6);
		System.out.println("The volume when one value specified is :" + b1.CalculateVolume());
		
		Box b2= new Box(1,2,3);
		System.out.println("The volume when h,w,l specified is :" + b2.CalculateVolume());
	}

}
