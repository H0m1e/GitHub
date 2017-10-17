package shape;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shape=new Circle();
		shape.girth();
		shape=new Rectangle();
		shape.area();
//多态必须参数一样，不然就成了重载
	}

}
