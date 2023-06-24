package study.report0623;
//문제 12 -다음을 만족하는 클래스 Rectangle을 작성하시오.

public class Rectangle {
	double width;
	double height;
	
	//사각형의 가로와 세로로 객체를 생성
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	//면적을 반환
	public double getArea() {
		return width * height;
	}
	
	//둘레를 반환
	public double getCircumference() {
		return (width + height) * 2;
	}
	
	public static void main(String[] args) {
		Rectangle rc =new Rectangle(3.82, 8.65);
		System.out.println("면적: "+ rc.getArea());
		System.out.println("둘레: "+ rc.getCircumference());
	}
}
