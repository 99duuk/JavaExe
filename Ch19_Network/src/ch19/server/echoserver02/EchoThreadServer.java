package ch19.server.echoserver02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoThreadServer {
	public static void main(String[] args) {
		final int PORT = 9000;
		try {
			ServerSocket server = new ServerSocket(PORT);
			System.out.println("Client 접속을 기다립니다...");
			while(true) {
				// 1. 클라이언트 접속(스트림이 연결되면 socket객체가 리턴된다.)
				Socket socket = server.accept();
				// 2. 클라이언트 담당 스레드 생성하여 통신을 전담시킨다.
				EchoThread echoThread = new EchoThread(socket); // ==> 워커 스레드 ㅇㅇ
				echoThread.start();
			}			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
// 스레드 상속받게 만들어 
class EchoThread extends Thread{
	private Socket socket; //내부  소켓변수 저장할 수 있도록 참조변수 줬고 
	
	public EchoThread(Socket socket) {
		this.socket = socket;	//소켓 넘겨받았기 때문에... 
	}
	
	@Override
	public void run() {
		try {
			InetAddress inetAddr = socket.getInetAddress();
			System.out.println(inetAddr.getHostAddress() + "로부터 접속했습니다.");
			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			// 통신할 수 있도록 만들어줬구여~..
			
			String line;
			while(true) {
				line = br.readLine();
				if(line==null)
					break;	//client 종료하면 빠져나가서 to 62 종료됐다~ 알려주는거에영 
				System.out.println("클라이언트로부터 수신: " + line);
				
				// 수신하자마자 Client한테 echo 전송
				pw.println(line);
				pw.flush();
			}
			System.out.println(inetAddr.getHostAddress() + " Client 종료");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}


//quit.. 무한루프.. 스레드 동작하는건데 quit 눌러서 스레드 stop!!...(?) 모르겠노...






