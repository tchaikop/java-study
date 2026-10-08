package interfacetest;

public class Mainclass {

	public static void main(String[] args) {
		
//		Animal animal = new Animal(); //  인스턴화 불가능, 추상클래스나 인터페이스는 인스턴스화는 안되지만
		
		
		Animal animal;  //  --> 선언 까지만 하는 것은 가능
		
		Dog dog = new Dog();
		
		animal = dog; // 업캐스팅 ---> 추상클래스도 업캐스팅이 가능
		animal = new Dog();
		
		
		
		
		
	}

}
