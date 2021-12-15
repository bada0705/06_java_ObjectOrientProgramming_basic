package step6_02.method;

/*
 * 
 * # return
 *   
 * 	1) 값을 반환한다.
 *  2) 메서드를 종료한다.
 *  3) 메서드에서의 return 값은 1개이다. 
 *  
 * */

class ReturnEx {
	
	void setScore1 (int score1) {
		score1 = 100;
	}
	
	int setScore2 (int score2) {
		score2 = 100;
		return score2;
	}
	
}

public class MethodEx03 {

	public static void main(String[] args) {

		ReturnEx obj = new ReturnEx();
		
		int score1 = 87;
		System.out.println("메서드 호출전의 성적 = " + score1); // 87
		
		obj.setScore1(score1);
		System.out.println("메서드 호출후의 성적 = " + score1); // 87
		
		System.out.println("=================================");
		
		int score2 = 87;
		System.out.println("메서드 호출전의 성적 = " + score2); // 87
		
		obj.setScore2(score2);
		System.out.println("메서드 호출후의 성적 = " + score2); // 87
		
		score2 = obj.setScore2(score2);
		System.out.println("메서드 호출후의 성적 = " + score2);  // 100
		
	}

}
