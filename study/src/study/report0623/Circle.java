package study.report0623;
// 문제 5 - 다음에 구현된 Circle 클래스를 참고로 다음을 만족하는 Cylinder 클래스를 작성하시오

public class Circle {
	
	public double radius;
	public static double PI= 3.141592;
	
	Circle(){}
	
	Circle(double radius, double PI){
		this.radius = radius;
		this.PI = PI;
	}
		 
	//생성자 구현
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//현재 반지름을 사용하여 원의 면적을 구하는 메소드
	public double getArea() {
		return radius * radius *PI;
	}
	
	
}
