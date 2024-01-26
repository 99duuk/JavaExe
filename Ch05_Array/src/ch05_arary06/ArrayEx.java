package ch05_arary06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {
	public static void main(String[] args) {

		// 배열의 얕은 복사/깊은 복사
		int[] scores = { 100, 88, 95, 67, 75 };
		int[] score1 = scores;
		int[] score2 = score1;

		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(score1));
		System.out.println(Arrays.toString(score2));
		System.out.println(scores);
		System.out.println(score1);
		System.out.println(score2);
		//다 같은 해시코드 ==> 같은 주소 가르키고 있넹~
		//이것이 무엇을 의미하느냐? 스택과 힙 영역 있잖? 
		//(VM에 의해 중계중..like os... os입장에선 걍 sw.. )
		//==> whole 공간 copy ㄴㄴ 참조값만 ㅇㅇ 
		//
		System.out.println();
		
		scores[2] = 99999;
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(score1));
		System.out.println(Arrays.toString(score2));
		//독립적 공간이었다면 99999변경에도 1,2는 그대로 있어야하는데 아니니
		//같은 공간 공유하는거 ㅇㅋ? 
		//(그렇다면 공간 분리하는 방법은? 
		
		//깊은 복사 ! = (힙에 별도의 공간을 생성한 후 scores4는 새로 생성한 공간을 가리키게 된다.
		//	기존 공간과 분리디ㅗ는 공간! 
		int[] scores4 = Arrays.copyOf(scores, scores.length);
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores4));
		System.out.println();
		
		scores[2] = 11111111;
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(score1));
		System.out.println(Arrays.toString(score2));
		System.out.println(Arrays.toString(scores4));
		
		
		
	}
}
