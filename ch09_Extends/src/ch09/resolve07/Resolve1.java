package ch09.resolve07;

import java.util.Scanner;

import ch09.resolve07.answer01.Add;
import ch09.resolve07.answer01.Div;
import ch09.resolve07.answer01.Mul;
import ch09.resolve07.answer01.Sub;

public class Resolve1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		String op;
		
		System.out.println("두 정수와 연산자 입력 : ");
		num1 = sc.nextInt();
		System.out.print(",");
		num2 = sc.nextInt();
		System.out.print(",");
		op = sc.next();
		
		switch(op) {
		case "+":
			Add add = new Add();
			add.setvalue(num1, num2);
			System.out.println(add.calculate());
			break;
		case "-":
			Sub sub= new Sub();
			sub.setvalue(num1, num2);
			System.out.println(sub.calculate());
			break;
		case "*":
			Mul mul = new Mul();
			mul.setvalue(num1, num2);
			System.out.println(mul.calculate());
			break;
		case "/":
			Div div = new Div();
			div.setvalue(num1, num2);
			System.out.println(div.calculate());
			break;
		default : System.out.println("잘못된 연산자입니다.");
			
		}
	}
}
