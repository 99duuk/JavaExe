package ch09.resolve07;

import java.util.Scanner;

import ch09.resolve07.answer02.Triangle;

public class Resolve2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w, h;
		
		Triangle tr1 = new Triangle();
		
		System.out.println("넓이와 높이 입력 : ");
		w = sc.nextInt();
		System.out.print(",");
		h = sc.nextInt();
		
		tr1.SetTriangle(w, h);
		tr1.CalTriangleArea();
		tr1.PrintTriangle();
		
		
		
		
			
		}
	}

