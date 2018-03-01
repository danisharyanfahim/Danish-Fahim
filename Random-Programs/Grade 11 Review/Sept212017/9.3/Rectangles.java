public class Rectangles{
    private double length = 0;
    private double width = 0;
    
    public Rectangles(){
	length = 0;
	width = 0;
    }
    
    public Rectangles(double l, double w){
	length = l;
	width = w;
    }
    
    public double getLength(){
	return length;
    }
    
    public double getWidth(){
	return width;
    }
    
    public void setLength(double l){
	length = l;
    }
    
    public void setWidth(double w){
	width = w;
    } 
    
    public double perimeter(){
	return 2 * (length + width);
    }  
    
    public double area(){
	return (length * width);
    }
    
    public boolean isSquare(){
	if (length == width){
	    return true;
	}
	else{
	    return false;
	}
    }
    
    
}
