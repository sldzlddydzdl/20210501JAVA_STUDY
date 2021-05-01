package ip;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. �������� ��ü ����
		
		try {
			while(true) { // ��� �ؼ� ���� ���
				ServerSocket serverSocket = new ServerSocket();
				serverSocket.bind(new InetSocketAddress("localhost" , 5001 ));
					// 2. ���������� ���ε� [ ���� ���� = ȣ��Ʈ�� , ��Ʈ �Ҵ� ]
				
				System.out.println("[ ���� ����� ]");
				
					// 3. ���������� ���� ������ ���Ͽ� ���
				Socket socket = serverSocket.accept();
				
				System.out.println("[ ���� ���� ] ");
				System.out.println("[������ : " + socket.getRemoteSocketAddress() + " ]");
				
				// �޼��� �ޱ� [ ��Ʈ�� ]
				
//				InputStream �ޱ� = socket.getInputStream();
//					// 1. ���� ������ �Է½�Ʈ�� ��������
//				byte[] ����Ʈ = new byte[500];
//				int ����Ʈ���� = �ޱ�.read( ����Ʈ ); // �о�� ������ ����Ʈ���� ������ ����
//					// 2. �Է½�Ʈ������ �о���� => ����Ʈ �迭�� ���� 
//				
//				String �������� = new String( ����Ʈ , 0 , ����Ʈ����);
//					// 3. �о�� ����Ʈ �迭�� ���ڿ��� ��ȯ : 0���� ����Ʈ��������
//				
//				System.out.println("[ �޼��� �ޱ� ���� ] : " + �������� );
//						
//				
//	
//				// Ŭ���̾�Ʈ���� ������ ���� [ ��Ʈ�� ��� ]
//				OutputStream ������ = socket.getOutputStream();
//					// 1. Ŭ���̾�Ʈ ������ ��½�Ʈ�� ��������
//				
//				System.out.print("������ �޽��� ���� : "  );
//				String �޽��� = sc.next(); 
//				
//					
//				����Ʈ = �޽���.getBytes(); // getBytes() : ���ڿ� -> ����Ʈ ��ȯ �޼ҵ�
//					// 2. ���ڿ� => ����Ʈ�� ��ȯ
//					 
//				������.write(����Ʈ); // write �޼ҵ� : ��� �޼ҵ�
//					// 3. ����Ʈ ��������
//				
//				System.out.println(" [�޼��� ���� ����] ");
//				
//				serverSocket.close();
//				socket.close();
//				�ޱ�.close();
//				������.close();
//				
			}

		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
