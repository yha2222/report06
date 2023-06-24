package study.report0623;
//문제 2 – main 메서드에서 실행시켰을 때 제조사, 생산년도, 크기를 출력하는 Tv클래스를 생성하시오.
public class Tv {
	protected String madeBy = "LG전자";
	protected int mdYy = 2022;
	protected int inch = 65;
	
	public void print() {
		System.out.println("제조사: " + madeBy);
		System.out.println("생산년도: " + mdYy);
		System.out.println("크기: " + inch + "인치");
	}
	
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.print();
	}
}
