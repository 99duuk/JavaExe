package ch12.object01.ch12.sec03.exam01;

//java의 모든 클래스의 최상위 부모는 Object 클래스가 된다. 
public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override				//어떤 클래스 객체도 다 받을 수 있는 Object obj
	public boolean equals(Object obj) {
		if (obj instanceof Member target) {
			if (id.equals(target.id)) {
				return true;
			}
		}
		return false;

	}
}
