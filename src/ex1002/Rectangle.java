package ex1002;
public class Rectangle {
		int width;
		int height;

		Rectangle(int width , int height) { //publicいる??
		this.width = width;
		this.height = height;
		}
		public String toString(){ //publicいる??
			return "[ " + this.width + " , " + this.height + "]";
			//thisいらない？
		}
 }
