package ch09_iskindof06;
/* 상속 할 땐 고려할거 많음
 * 1) 부모로 정할 클래스 <--> 자식 클래스 간
 * 		자연스러운 종속 관계인가? 
 * 		자연스러운 종속 관계라면 상속 고려 ㄱㄴ
 * 		아니면 사용 X 
 * 		ex) Gun - Police : 자연스러운 종속관계 아니라 
 * 							Police가 Gun의 기능이 필요한 관계 
 * 2) 만약 이 예제처럼 상속관계 정한다면
 * 		2-1) 불필요한 기능을 제공함으로써 잘못된 서비스/오류를 야기할 가능성이 
 * 			매우 높아진다. 
 * 		2-2) 상속관계를 가지면 부모의 모든 개게는 자식 객체에 포함되므로 
 * 			메모리의 낭비를 가져올 수 있다.
 * 3) 그러므로 Gun - Police 관계는 상속 < 포함 관계가 더 나을 수 있다.  
 * */
public class PoliceMain {
public static void main(String[] args) {
	ForcePolice fp = new ForcePolice(10,5);
	fp.run();			//달린다
	fp.fight();			//싸운다
	fp.shot();			//총 쏴서 위협
	fp.putHandCuff();	//수갑 채운다	
	
	NursePolice np = new NursePolice(10, 5, 3);
	np.calcThermometer(); //온도 측정
	np.putHandCuff();
	np.shot();
	np.shot();
	np.shot();
}
}
