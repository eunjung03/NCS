package sist;

import java.io.*;
import java.net.*;

public class ClientExample {

	public static void main(String[] args) {

		try {
			// 서버에 연결 요청을 해 보자.
			Socket socket = new Socket();
 			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("[연결 성공]");
			
			byte[] bytes = null;
			String message = null;
			
			// 서버에 데이터(문자)를 보내자.
			OutputStream os = socket.getOutputStream();
			message = "Hello Server";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			
			// 서버에서 보낸 데이터를 받아 보자.
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes, 0, readByteCount, "UTF-8");
			System.out.println("[서버에서 받은 데이터 받기 성공] >>> "+message);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
				
	}

}
