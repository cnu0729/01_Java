package sup2.model;

public class Student {
	/*
	학생의 이름, 학년, 반, 번호, 성별, 성적을 키보드로 입력받아 출력 처리한다.
	단, 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 삼항연산자를 사용하여 출력 처리한다.
	*/

	private String 이름;
	private int 학년;
	private int 반;
	private int 번호;
	private char 성별;
	private int 성적;
	
//메서드
	//필수
	public Student(String 이름, int 학년, int 반, int 번호, char 성별, int 성적) {
		this.이름 = 이름;
		this.학년 = 학년;
		this.반 = 반;
		this.번호 = 번호;
		this.성별 = 성별;
		this.성적 = 성적;
	}
	
	public void 정보() {
		String 성별확인 = (성별 == 'M') ? "남학생" : "여학생" ;
		
		System.out.println(학년+"학년 "+반+"반 "+번호+"번 "+성별확인+" "+이름+"는 성적이 "+성적+"점이다.");
		
	}

}
