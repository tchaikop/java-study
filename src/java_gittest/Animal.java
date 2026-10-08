package interfacetest;

public interface Animal {  // interface키워드로 인터페이스 생성
	
//	int age;  초기화가 되지 않으면 안된다
	final int age =10; // --> 상수만 선언가능하다
	public static final double pi=3.14;
	// 인터페이스는 --> 추상메서드만 선언 가능하다
	
	// 상수와 추상 메서드만 가진다, 생성자도 안된다
	// 다중 상속이 가능하다
	
	// default 값은 기본값, 기본 메서드, 억지로 넣을 수 있는데 써넣을 일이 없다
	// static  정적  <--> dynamic 동적
	
	
	public void sound();  // abstract 는 여기서 빼먹어도 된다. 이 자체가 추상메서드들만 가지기 때문이다.
	
	public void move();
	
	
//	public static void (); // 구현을 하지 않으면 에러가 난다  //overriding 불가능
	
	public static void statictest() {
		System.out.println("나는 정적 메서드야");
	}
	
	public default void defaultset () {
		System.out.println("정지");
	}
	
//	Animal.Static void();  -->  이렇게 사용
//   Animal.pi;   ---->  이렇게 사용
	
	
}
