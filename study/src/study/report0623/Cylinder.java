package study.report0623;
// 문제 5 - 다음에 구현된 Circle 클래스를 참고로 다음을 만족하는 Cylinder 클래스를 작성하시오.

//문제 6 - 위에서 구현한 Cylinder를 다음 조건에 맞도록 기능을 추가하여 작성하시오.
//다음과 같은 객체 생성이 가능하도록 생성자를 구현 . Cylinder cd = new Cylinder(new Circle(2.8), 5.6);

public class Cylinder extends Circle {
	double height;
	Circle circle;
	
	Cylinder(){
		circle = new Circle();
	}
	
	//Cylinder(Circle circle, double height){
	//	this.height = height;
	//}
	
	Cylinder(double radius, double PI, double height){
		super(radius, PI);
		this.height = height;
	}
	
	public static void main(String[] args) {
		Cylinder cd1 = new Cylinder();
		cd1.radius = 2.8;
		cd1.height = 5.6;
		cd1.print();
		
		//Cylinder cd2 = new Cylinder(new Circle(2.8), 5.6);
		//cd2.print();
	}
	
	//원기둥의 부피 
	public double getVolume() {
		return radius * radius * height * PI;
	}
	
	public void print() {
		System.out.println("원: " + circle.getArea());
		System.out.println("원통의 부피: " + getVolume());
	}
	
}
