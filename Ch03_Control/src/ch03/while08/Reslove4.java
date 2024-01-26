package ch03.while08;

public class Reslove4 {
	public static void method1() {
		int i = 1;
		while (i <= 10) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	public static void method2() {
		int num = 2;
		while (num <= 10) {
			System.out.println(num);
			num+=2;
		}
	}
	public static void main(String[] args) {
		method1();
		System.out.println("---");
		method2();
			
		}
		
	}

