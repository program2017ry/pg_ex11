package ex1003;

public class ProductItem {
	String name;
	int price;
	@Override
	public String toString(){
		return " [ " + name + " , " + price + " ]";
	}
}
