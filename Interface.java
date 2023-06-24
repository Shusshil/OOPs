package OOPs;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape mycircle = new Circle(4);
	       // dot(.) operator is used to access all the public fields and methods of the class

	       shape myrectangle = new Rectangle(9,10);
	       shape mysquare = new Square(5);


			System.out.println("Area of circle = " + mycircle.getArea());
	       System.out.println("Area of square = " + mysquare.getArea());
	       System.out.println("Area of rectangle = " + myrectangle.getArea());


	       System.out.println("\nperimeter of circle = " + mycircle.perimeter());
	       System.out.println("perimeter of square = " + mysquare.perimeter());
	       System.out.println("perimeter of rectangle = " + myrectangle.perimeter());
	}

}
interface shape{
    float getArea();
    float perimeter();
}
class Circle implements shape{
    float radius;
    Circle(float Radius){
        this.radius = Radius; 
    }
    
    
    @Override
    public float getArea(){
        return (3.141f)*radius*radius;
    }
    
    public float perimeter(){
        return 2*(3.141f)*radius;
    }
    
    
    
}
class Square implements shape{
    float side;
    
    
    Square(float side){
        this.side = side;
    }
    
    public float getArea(){
        return side*side;
    }
    public float perimeter(){
        return 4*side;
    }
}
class Rectangle implements shape{
    float length;
    float breadth;
    
    public Rectangle(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
    public Rectangle(float breadth){
        this.breadth = breadth;
        length = 3;
    }
    
    public float getArea(){
        return length*breadth;
    }
    public float perimeter(){
        return 2*(length + breadth);
    }
}
