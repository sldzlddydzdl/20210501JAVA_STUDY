package application;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javafx.scene.Scene;

public class Client {

	// ������ Ŭ���̾�Ʈ 
	
	Socket socket; // ���� ����
	
	public Client(Socket socket) {
		
		this.socket = socket;
		receive(); // ���ӵ� ���ĺ��� �޽��� �ޱ� �޼ҵ� ����
		
	}
	
	// �޽��� �ޱ� [ ������ Ŭ���̾�Ʈ�� �޽����� ���� ] // ��Ƽ������
	public void receive() {
		Runnable thread = new Runnable() {
			@Override
			public void run() {
			
				try {
					while(true) {
						InputStream in = socket.getInputStream(); // 1. ������ ��Ʈ�� ��������
						byte[] buffer = new byte[500]; // ��Ʈ�� �̵����� = ����Ʈ
						
						int count = in.read(buffer); // 2. ��Ʈ���� ����Ʈ�� �о�ͼ� �迭�� ����
						String message = new String(buffer, 0 , count , "UTF-8");
							// ����Ʈ => ���ڿ���ȯ ( ��ȯ �� , ������ġ , ����ġ , ���ڵ�[ ���� ] )
							// UTF-8 : ������ ����� ����
						
						 
						for(Client temp : Main.clients) { // (!!! �߿�) ���� �޽����� ���ӵ� Ŭ���̾�Ʈ���� ��� ������
							temp.send(message);
						} // for
					} // while
				} // try
				catch (Exception e) {
					// TODO: handle exception
				}
			} // run ��
		}; // ������ �� 
		
		Main.threadpool.submit(thread); // �ش羲����� ������Ǯ�� �ֱ� 
		
	}
	
	// �޽��� ������ 
	public void send(String message) {
		
		Runnable thread = new Runnable() {
			
			@Override
			public void run() {
				try {
					OutputStream out = socket.getOutputStream(); // 1. ������ ��½�Ʈ�� ��������
					byte[] buffer = message.getBytes("UTF-8"); // ���ڿ� => ����Ʈ��
					out.write(buffer); // ����Ʈ �������� 
					out.flush(); // ���� �ʱ�ȭ
				
					
				}
				catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		};// ������ ��
		
		Main.threadpool.submit(thread);
	
	}
	
}
