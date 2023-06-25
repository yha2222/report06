package study.report0623;
//문제 11 - 위에서 구현된 메소드 withdraw()를 다음 조건에 맞게 다시 작성하시오.
//· 인출 상한 금액은 잔액까지로 하며, 이 경우 이러한 상황을 출력
//· 클래스 AccountTest의 main() 메소드에서 인출 상한 이상의 금액을 인출하려는 메소드를 호출하여 출력
public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.withdraw(5000000);
	}

}
