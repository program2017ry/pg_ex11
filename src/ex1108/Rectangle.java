package ex1108;

public class Rectangle {
	private int width;
	private int height;
	Rectangle(){
		setSize(10,20);
	}
	Rectangle(int w, int h){
		setSize(w,h);
	}
	void setSize(int w, int h){
		if(w > 0){
			width = w;
		}else{
			width = 0;
		}
		if (h>0){
			height = h;
		}else{
			height = 0;
		}
	}
	int getArea(){
		return width * height;
	}
	public static void main(String[] args){
		Rectangle r1 = new Rectangle();
		System.out.println("r1.width = " + r1.width);
		System.out.println("r1.height = " + r1.height);
		System.out.println("r1.getArea = " + r1.getArea());
		Rectangle r2 = new Rectangle();
		System.out.println("r2.width = " + r2.width);
		System.out.println("r2.height = " + r2.height);
		System.out.println("r2.getArea = " + r2.getArea());
		}
}
