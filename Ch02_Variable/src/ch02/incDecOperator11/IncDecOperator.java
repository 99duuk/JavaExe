package ch02.incDecOperator11;

public class IncDecOperator {
	public static void main(String[] args) {
		int num = 0 ;
		// 전/후위 증감연산자
		num++;		//(= num += 1 , num = num + 1) 
		System.out.println(num);
		
		++num;
		System.out.println(num);
		
		
		int result = num++; 	//값 넘겨주는게 우선~
		System.out.println("result=" + result);
		System.out.println("num=" + num);
		
		result = ++num; 	//증감이 우선 
		System.out.println("result=" + result);
		System.out.println("num=" + num);
		
		System.out.println("num=" + num--);  
		System.out.println("num=" + --num); 
	}

}
