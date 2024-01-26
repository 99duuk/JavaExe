package ch03.while08;

public class Reslove3 {
	public static void main(String[] args) {
		int i = 1;
		int j = 0;
		
		while (i <= 10) {
			j = j + i;
			i++;
			
		}
		System.out.println(j);
	}
}
/*
		int i = 1, sum = 0;
		while (i <= 10 ) {
			sum += i;
			System.out.print(i + " : " + sum);
			System.out.println();
			i++;
		}
		System.out.println(sum);

		}
*/