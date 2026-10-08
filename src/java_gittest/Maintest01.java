package interfacetest;

public class Maintest01 {

	public static void main(String[] args) {
	
		Payment pay;
		
		// Payment pay = new Card();  ---> card, card2 같은 개념은 못 만들고 바로 pay 로 대입되는 것이 단점
		//  pay = new Cash();  //  이러면 안되는거, 처음 주소 card를 날린거다
		
//		pay = new Card();
		Card card = new Card();
		Cash cash = new Cash();
		
		
		pay = card;  //  얕은 복사
		pay.pay(46060000);
//		card.pay(50000);
		
		System.out.println("=======");
		
		pay = cash;
//		cash.pay(300000);
		pay.pay(400000);
		System.out.println("=======");
		
		int price = 700000;
		if(price >= 100000) {
			pay = card;   // card.pay(price)
		} else {
			pay = cash;  //  cash.pay(price)
		}
		pay.pay(price);  // 업캐스팅
	}
//  추가 작업을 진행한다
	
	// 추가 더 했다
}
