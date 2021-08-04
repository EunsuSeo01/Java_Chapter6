/**
 * 연습문제 6-5 풀이.
 * @author user EunSu Seo
 * last modified 2021-08-04
 */
public class Exercise6_5 {
	public static void main(String[] args) {
		Student2 s = new Student2("홍길동",1,1,100,60,76);
		System.out.println(s.info());
	}
}

class Student2 {
	String name;
	int ban;	// 반.
	int no;		// 번호.
	int kor;
	int eng;
	int math;

	// 생성자 추가.
	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 국영수 점수를 모두 더해서 반환하는 메서드.
	int getTotal() {
		return kor + eng + math;
	}

	// 총점을 과목수로 나눈 평균을 구하는 메서드. 소수점 둘째자리에서 반올림.
	float getAverage() {
		// 평균 * 10 하면 78.67... 이 786.7...이 돼서 Math.round()의 인자로 넣으면 원래 둘째자리였던 7이 반올림 돼서 787로 됨.
		// 그걸 원래대로 나누기 10 해서 78.7로 만든 것.
		return (float) Math.round((float) getTotal() / 3 * 10) / 10;
	}

	// info() 추가.
	String info() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}
}
