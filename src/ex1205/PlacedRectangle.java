package ex1205;

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
;

public class PlacedRectangle  extends Rectangle {
	Rectangle r;
	int x;
	int y;
	 PlacedRectangle(){
		r = new Rectangle();
		 setLocation(0,0);
	 }
	 PlacedRectangle(int x, int y){
		 r = new Rectangle();
		 setLocation(x,y);
		 }
	 PlacedRectangle(int x, int y, int width, int height){
//		 setSize(width,height);
		 r = new Rectangle(width,height);
		 setLocation(x,y);
	 }
	void setLocation(int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString(){
		return "[ (" +  x + ", "  +  y + ")" + r + "]";
	}
	}
}

