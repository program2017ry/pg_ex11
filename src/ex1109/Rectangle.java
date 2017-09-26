package ex1109;

public class Rectangle {
	private int width;
	private int height;
	final int INITIAL_WIDTH = 10;
	final int INITIAL_HEIGHT = 20;
	private int x;
	private int y;

	public Rectangle(){
		setSize(0,0);
		setLocation(INITIAL_WIDTH,INITIAL_HEIGHT);
	}

	public Rectangle(int w, int h){
		setSize(w,h);
		 setLocation(0,0);
	}

	public Rectangle(int x, int y, int w, int h){
		setSize(w,h);
		setLocation(x,y);
	}

	public void setLocation(int xx, int yy){
		this.x = xx;
		this.y = yy;
		}

	public void setSize(int w, int h){
			this.width = w;
			this.height = h;
			}

	@Override
	public String toString(){
		return "["+ x +  " ,"+ y +  " ,"+ width +  " ,"+ height +  " ]";
		}

	public Rectangle intersect(Rectangle r){
		int sx = Math.max(this.x , r.x);
		int sy = Math.max(this.y , r.y);
		int lx = Math.min(this.x + this.width , r.x + r.width);
		int ly = Math.min(this.y + this.height , r.y + r.height);
		int newwidth = lx - sx;
		int newheight = ly - sy;
		if ((newwidth > 0) && (newheight > 0)){
			return new Rectangle(sx,sy,newwidth,newheight);
			} else {
				return null;
			}
		}


}
