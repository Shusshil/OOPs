package OOPs;

public class Main {

public static void main(String args[]) {
    circle c = new circle(5);
    System.out.println("circle area="+c.getArea());
    cylinder cr = new cylinder(5,7);
    System.out.println("cylinder volume=" +cr.getVolume(5,7));
}
}

class circle{
    int radius;
    public circle(int radius) {
        if(radius < 0){
            this.radius = 0;
        }
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
}
class cylinder extends circle{
    int height;
    cylinder(int radius,int height){
        super(radius);
        if(height<0){
            this.height = 0;
        }
        this.height = height;
    }
    public double getVolume(int radius,int height){
        return super.getArea()*height;
    }
}
