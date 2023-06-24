package OOPs;

public class Equal_To {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point p1=new point(0,1);
		point p2=new point(0,1);
		System.out.print(p2.equalto(p1));
		
	}
}
class point{
	int x,y;
	point(int x,int y){
	   this.x=x;
	   this.y=y;
	}
	public boolean equalto(point p){
	    if(this.x == p.x && this.y == p.y){
	       return true;
	    }
	    else{
	        return false;
	    }
    }
}
