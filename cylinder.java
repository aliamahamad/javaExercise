
public class cylinder{

	public double radius, height;
	public double area;
	public cylinder(){

		radius = 1;
		height = 1;

	}

	public cylinder(double rad, double hgt){

		radius = rad;
		height = hgt;

  }
    public void Calculate(){
        area = (2*Math.PI*rad)*2+hgt(2*Math.PI*rad);

}

   public static void main (String args[]){

   cylinder cyli = new cylinder(32,20);
   cyli.Calculate();
   System.out.println("Radius :"+cyli.radius);
   System.out.println("Height :"+cyli.height);
   System.out.println ("Area :"+cyli.area);

}
}