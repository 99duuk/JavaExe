package resolve14.question03;

//난수 3개 생성 역할
public class GeneratorThreeNum {
	public static int[] getRandomNum() {
		int[] numArr = new int[3];
		// 1번째 난수 생성
		numArr[0] = (int)(Math.random()*10);		//0 ~ 9 난수 생성
		
		//2번째 난수 생성
		boolean isRun = true;
		while(isRun) {
		int rNum = (int)(Math.random()*10);
//		1번째 값과 같으면 다시 반복해서 다시 생성
		if (rNum == numArr[0])
			continue;
		numArr[1] = rNum;
		isRun = false;
	}

	// 3번째 난수 생성
	while(isRun){

	int rNum = (int) (Math.random() * 10);
//		1번째 값과 같으면 다시 반복해서 다시 생성
	if(rNum==numArr[0]||rNum==numArr[1])continue;numArr[1]=rNum;isRun=false;
}return numArr;

}}
