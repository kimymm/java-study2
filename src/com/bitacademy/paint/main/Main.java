package com.bitacademy.paint.main;

import com.bitacademy.paint.i.Drawable;
import com.bitacademy.paint.point.Point;
import com.bitacademy.paint.shape.Circle;
import com.bitacademy.paint.shape.Rectangle;
import com.bitacademy.paint.shape.Shape;
import com.bitacademy.paint.shape.Triangle;
import com.bitacademy.paint.text.ColorPoint;
import com.bitacademy.paint.text.GraphicText;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point1 = new Point();
		point1.setX();
		
		draw(point1); // 결국 인터페이스까지해서  초단축이 되는과정인걸
		
		
		
		
		
		Point point3 = new ColorPoint();
		point3.setX(200);
		point3.setY(1000);
		
		ColorPoint point4 = (ColorPoint) point3; // 
		point4.setColor("red"); //setColor는 정의안해서 오류날것임, 그냥 무시
		//또는
		((ColorPoint)point3).setColor("red"); // 많이 사용할 예정 (업캐스팅) 부->자로 갈 때
												//명시적 (ColorPoint) 자식객체로 지정
												//point3는 부모의 인스턴스였죠?
		
		//근데 왜 색이 안나오냐? : 부모에서 show()와 자식의 show()를 오버라이딩 해야하는 것.
		// p3.show(); show(){..}을 ColorPoint에서
		point3.setColor("red"); //왜 칼라가 안찍히지?
		
		//Rectangle
		Rectangle rectangle = new Rectangle();
//		drawRectangle = 
				
//		drawShape(rectangle);
		draw(rectangle); // Interface-Shape
		
		draw(circle);
		
		Circle circle = new Circle();
		drawShape(circle); 
	}
		
		//Triangle (rect cp)
		Triangle triangle = new Triangle();
		drawTriangle(triangle);
		draw(triangle);
		public static void drawPoint(Point point) {
			drawPoint(point3);
			point.show();
		}
	//	public static void drawColorPoint(ColorPoint colorPoint) { // 한번 털리는 코드
	//		colorPoint.show();
	//	}
	
		public static void drawShape(Shape shape) {
			shape.draw(); // 이걸 만들었어야지 drawSape(circle);
		}
		//Rectangle
		
		//수정중..
		public static void drawRectangle(Rectangle rectangle) {
			rectangle.draw();
		}
		public static void drawTriangle(Triangle triangle) {
			triangle.draw();
			
		public static void draw(Drawable drawable) {
			drawable.draw();
			
			
			
			
			GraphicText gt = new GraphicText("Hello World");
			draw(gt);
			
			
			
			//instanceof test
			System.out.println(Point instanceof Circle);
			System.out.println(colorPoint instanceof Shape);
			System.out.println(rectangle instanceof Drawable);
			System.out.println(triangle instanceof Object); // 다물어볼수 있지요
			// 오류 : class는 hierachy 상위와 하위만 instanceof 연산자를 사용할 수 있다.
//			System.out.println(circle instanceof Rectangle); //당연히 안되겠지
			// 하지만, interface는 hierachy와 상관없이 instanceof 연산자를 사용할 수 있다.
			System.out.println(circle instanceof Drawable);
			System.out.println(circle instanceof Runnable); //이게뭐야!
			//inteface 는 다 물어볼수 있다 hierachy구조가 아니라서
			
			
		}
	}
		
	
		
	//circle 안만들어도 되죠 : shape
}
