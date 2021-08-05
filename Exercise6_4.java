/**
 * 연습문제 6-3, 6-4 풀이.
 * @author user EunSu Seo
 * last modified 2021-08-04
 */
public class Exercise6_4 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름: " + s.name);
		System.out.println("총점: " + s.getTotal());
		// 소수점 둘째자리에서 반올림한 수를 출력하기 위해.
	    // System.out.printf("평균: %.1f", s.getAverage());
		// 또는 Math.round() 사용. Math.round() : 소수점 첫 번째 자리를 반올림하여 정수로 반환해 주는 메서드.
		System.out.println("평균: " + s.getAverage());
	}
}

class Student {
	String name;
	int ban;	// 반.
	int no;		// 번호.
	int kor;
	int eng;
	int math;
	
	// 국영수 점수를 모두 더해서 반환하는 메서드.
	int getTotal() {
		return kor + eng + math;
	}
	
	// 총점을 과목수로 나눈 평균을 구하는 메서드. 소수점 둘째자리에서 반올림.
	float getAverage() {
		// 평균 * 10 하면 78.67... 이 786.7...이 돼서 Math.round()의 인자로 넣으면 원래 둘째자리였던 7이 반올림 돼서 787로 됨.
		// 그걸 원래대로 나누기 10 해서 78.7로 만든 것.
		return (float) Math.round((float) getTotal() / 3 * 10) / 10;
		// return (int)((getTotal() / 3f * 10 + 0.5f) / 10f; 
	}
}