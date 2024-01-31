package ch09.resolve07;

import java.util.Scanner;

public class Resolve2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w, h;
		boolean isRun = true;
		Triangle tr1 = new Triangle();
		
		System.out.println("넓이와 높이 입력 : ");
		w = sc.nextInt();
		System.out.print(",");
		h = sc.nextInt();
		
		tr1.SetTriangle(w, h);
		tr1.TriangleArea();
		tr1.PrintTriangle();
		
		
		
		
			
		}
	}

