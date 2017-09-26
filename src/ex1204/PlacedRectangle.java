package ex1204;

class Rectangle {
	int width;
	int height;
	Rectangle(){
		setSize(0,0);
	}
	Rectangle(int width, int height){
		setSize(width,height);
	}
	void setSize(int width, int height){
		this.width = width;
		this.height = height;
	}
	@Override
	public String toString(){
		return "[" + width + ", " + height + "]";
}

public class PlacedRectangle extends Rectangle {
	int x;
	int y;
	 PlacedRectangle(){
		 setLocation(0,0);
	 }
	 PlacedRectangle(int x, int y){
		 setLocation(x,y);
		 }
	 PlacedRectangle(int x, int y, int width, int height){
//		 setSize(width,height);
		 super(width,height);
		 setLocation(x,y);
	 }
	void setLocation(int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString(){
		return "[ (" +  x + ", "  +  y + ")" + super.toString() + "]";
	}
	}
}