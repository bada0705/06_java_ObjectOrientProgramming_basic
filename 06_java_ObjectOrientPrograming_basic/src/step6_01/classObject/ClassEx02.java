package step6_01.classObject;

/*
 * 
 * # 클래스의 범위
 * 
 * 		- 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.
 *       ( 구체적인 접근제어자는 객체지향 기법에서 공부 )
 * 
 * */

class Student {
	String name;
	int score;
}


public class ClassEx02 {

	public static void main(String[] args) {

		Student std1 = new Student();
		std1.name = "제임스고슬링";
		std1.score = 100;
		
		System.out.println(std1.name);
		System.out.println(std1.score);
		System.out.println();
		
		
		Character c1 = new Character();
		
		System.out.println(c1);
		System.out.println(c1.level);
		System.out.println(c1.power);
		System.out.println(c1.dex);
		System.out.println(c1.life);
		System.out.println(c1.mana);
		System.out.println();
		
		Ex01 e1 = new Ex01();
		System.out.println(e1);
		System.out.println(e1.x);
		System.out.println(e1.y);
		
		
	}

}
