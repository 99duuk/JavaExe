package ch05_arary04;
import java.util.Arrays;
import java.util.Scanner;
//6. 5명의 학생의 이름과 점수를 입력받고
//해당학생의 이름과 학점이 A, B, C, D, F로 출력되도록 하세요
//A : 90이상, B : 80이상, C : 70이상, D : 60이상, F : 60미만
public class Resolve6 {
	public static void main(String[] args) {
		int[] score = new int[5];
		String[] names = new String[5];
		
		Scanner sc = new Scanner(System.in);
	
		for(int i = 0; i < score.length; i++) {
			System.out.println((i+1) + "번째 학생 점수 >>");
			score[i] = sc.nextInt();
			
			
			
			
		}
		for (int j = 0; j <names.length; j++) {
			System.out.println((j+1) + "번째 학생 이름 >>");
			names[j] = sc.nextLine();
		}
		
		
		

	}
}
