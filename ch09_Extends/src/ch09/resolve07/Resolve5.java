package ch09.resolve07;

import java.util.Arrays;

public class Resolve5 {
	public static void main(String[] args) {
	
		Ball child1 = new Ball(15);
		Ball child2 = new Ball(9);
		
		child1.currentBall();
		child2.currentBall();
		
		child1.giveBall(child2, 2); 	//1차 놀이 1 to 2 2개
		
		child2.giveBall(child1, 7);		//2차 놀이 2 to 1 7개
		
		
		System.out.print("어린이 1의");
		child1.currentBall();
		System.out.print("어린이 2의");
		child2.currentBall();
		
		
		
		
		}
	}

