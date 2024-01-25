package ch02.transtype05;

public class TransDataType {	//형변환	
	public static void main(String[] args) {
		int total = 297;	//총점	
		int stNum = 4;		//학생 수 
		double avg = 0;
		System.out.println("총점은 " + total + "입니다.");
		System.out.println("평균은 " + total + "입니다."); //total/stNum == 74; 정수정수 연산 : 정수  
		avg = total / stNum;
		System.out.println("평균은 " + avg + "입니다.");
		avg = (double)total / stNum;		//강제 형변환 한쪽에 double 붙여~
		// (double)total : 컴파일러에 의해 정수 total은 double로 변환 
		/* 실수와 정수 연산의 결과는?
		 * 실수의 표현범위 > 정수
		 * 결과값은 실수 자료형으로 나옴 
		 */
		System.out.println("평균은 " + avg + "입니다.");
		
		int nAvg = (int)avg;	//(int)로 바꾼 상태에서 ㄱㄱ. 컴파일러 오류남~
		System.out.println("평균은 " + nAvg + "입니다.");
		
		char ch = 'A'; 	//2byte 유니코드로 저장.. 
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println((int)'a');
		System.out.println((char)66);
		System.out.println((char)98);
	}
}
