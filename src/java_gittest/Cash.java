package interfacetest;

public class Cash implements Payment {

	@Override
	public void pay(int money) {
		System.out.println("현금으로" + money + "원 결제 합니다.");
		
	}

}
