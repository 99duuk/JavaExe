package method01;
//3. int result = total(10, 100);
//위처럼 사용하면 result에는 10부터 100까지의 누적합이 저장되어야 합니다
//total메서드를 작성하고 사용해보세요.
public class Resolve3 {
	public static int total (int n0, int n1) {
		int sum = 0;
		for(int i = n0 ; i <= n1 ; i++) {
			sum +=i;
		}
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		int result = total(1,100);
		System.out.println("누적합 " + result);
		
		int result1 = total(10,20);
		System.out.println("누적합 " + result1);
		
		int result2 = total(1,1000);
		System.out.println("누적합 " + result2);
	}
}
