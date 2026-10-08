package interfacetest;

public class Card implements Payment {

	@Override
	public void pay(int money) {
		System.out.println("카드로 " + money + "원을 결제 합니다");
		
	}

}
