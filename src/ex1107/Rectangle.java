package ex1107;

public class Rectangle {
	int width;
	int height;
	@Override
	public String toString(){
		return "Rectangle(" + width + ", " + height + ")";
	}
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}


}
