package ch13.sec02.exam01;

// 제네릭 타입, K, M 은 대명사!!! 
// 관습적으로 대문자 1자 정도 씀 ㅇㅇ
// if 多 타입 필요? Product<K, M, S, D, C, A...> ㄱㄴ  
public class Product<K, M> {
	//필드 
	private K kind;
	private M model;
	
	//메소드
	public K getKind() { return this.kind;}
	public M getModel() {return this.model;}
	public void setKind(K kind) {this.kind = kind;}
	public void setModel(M model) {this.model = model;}
	
}
