package study.report0623; 

public class Account {
	private String owner;
	private long balance;
	long amount;
	
	//문제 9.위 모든 필드를 사용하는 가능한 모든 생성자의 구현
	Account(){}
	
	Account(String owner){
		this.owner=owner;
	}
	
	Account(long balance){
		this.balance=balance;
	}
	
	Account(String owner, long balance){
		this.owner=owner;
		this.balance=balance;
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	//문제 10 - 위에서 구현된 클래스 Account에서 다음 기능을 추가하여 작성하시오
	//인자인 금액을 저축하는 메소드
	public long deposit(long amount) {
		return amount;
	}
	
	//인자인 금액을 인출하는 메소드
	public long withdraw(long amount) {
		return amount;
	}
	
	//문제 11 - 위에서 구현된 메소드 withdraw()를 다음 조건에 맞게 다시 작성하시오.
	//· 인출 상한 금액은 잔액까지로 하며, 이 경우 이러한 상황을 출력
	//· 클래스 AccountTest의 main() 메소드에서 인출 상한 이상의 금액을 인출하려는 메소드를 호출하여 출력
	
	//Account 클래스의 main() 메소드에서 Account 객체를 생성하여 적당한 저축과 인출을 수행한 후 잔금을 출력
	public static void main(String[] args) {
		
	}
}
