package ch10.collection01.ch15.sec04.exam03;
/*	web prog에서 환경설정 값을 파일에 보관하고
 * 	상황에 따라 바꿈
 * 	java prog에서는 이런 환경설정 파일을 읽어 처리해야하는데
 * 	이 때 외부 파일을 주로 *.Properties 파일을 사용하고
 * 	이 파일을 읽어들이는 용도로 Properties클래스를 사용한다.
 * 
 * 	key=value 구조로 되어있다.
 * 	한글은 유니코드 형식으로 변환되기 때문에 
 * 	.txt에 내용을 작성한 후 
 *  .properties에 붙여넣기하는 방식으로 주로 사용함 
 */

import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		//Properties 컬렉션 생성
		Properties properties = new Properties();
		
		//PropertiesExample.class 와 동일한 ClassPath에 있는 database.properties 파일 롣 ㅡ
		properties.load(PropertiesExample.class.getResourceAsStream
				("database.properties"));
		
		//주어진 키에 대한 값 읽기
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("usernmae");
		String password = properties.getProperty("password");
		String admin = properties.getProperty("admin");
		
		//값 출력 
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		System.out.println("admin : " + admin);
		
		
		
	}
}
