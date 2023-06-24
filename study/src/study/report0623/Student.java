package study.report0623;
//문제 1 -다음을 만족하는 Student 클래스를 작성하시오.
//String형의 학과와 정수형의 학번을 필드로 선언
//Student 클래스의 main() 메소드에서 Student 객체를 생성하여 학과와 학번 필드에 적당한 값을 입력 후 출력
public class Student {
	
	private String major;
	private int stdNo;
	
	//문제 7.필드를 모두 private로 하고, getter와 setter를 구현하고 
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getStdNo() {
		return stdNo;
	}
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}

	Student(String major, int stdNo){
		this.major = major;
		this.stdNo = stdNo;
	}
	
	public static void main(String[] args) {
		Student s = new Student("국어국문학과", 20220013);
		System.out.println("학과: " + s.getMajor());
		System.out.println("학번: " + s.getStdNo());
		
		//문제 7.Student 클래스의 main() 메소드에서 Student 객체를 생성하여 setter를 사용
		//학과와 학번 필드에 적당 한 값을 입력 후 출력		
		s.setMajor("정치외교학과");
		s.setStdNo(20230023);
		System.out.println("학과: " + s.getMajor());
		System.out.println("학번: " + s.getStdNo());
	}

}
