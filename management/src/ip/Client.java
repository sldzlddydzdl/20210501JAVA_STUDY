package ip;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	
	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		
		//1. ��Ĺ ����
		while(true) {
		Socket socket = new Socket();
		System.out.println("[ ���� ��û ]");
		// 2. ���� ��û [ ���ε� �� ������������ ] = ����ó��
		
			try {
				while(true) {
					socket.connect(new InetSocketAddress("localhost" , 5001));
					System.out.println("[ ���� ���� ]");
					
					
					// �������� ������ ���� [ ��Ʈ�� ��� ]
//					OutputStream ������ = socket.getOutputStream();
//						// 1. Ŭ���̾�Ʈ ������ ��½�Ʈ�� ��������
//					
//					System.out.print("������ �޽��� ���� : "  );
//					String �޽��� = sc.next(); 
//					
//						
//					byte[] ����Ʈ = �޽���.getBytes(); // getBytes() : ���ڿ� -> ����Ʈ ��ȯ �޼ҵ�
//						// 2. ���ڿ� => ����Ʈ�� ��ȯ
//						 
//					������.write(����Ʈ); // write �޼ҵ� : ��� �޼ҵ�
//						// 3. ����Ʈ ��������
//					
//					System.out.println(" [�޼��� ���� ����] ");
//					
//					// �޼��� �ޱ� [ ��Ʈ�� ]
//					
//					InputStream �ޱ� = socket.getInputStream();
//						// 1. ���� ������ �Է½�Ʈ�� ��������
//					����Ʈ = new byte[500];
//					int ����Ʈ���� = �ޱ�.read( ����Ʈ ); // �о�� ������ ����Ʈ���� ������ ����
//						// 2. �Է½�Ʈ������ �о���� => ����Ʈ �迭�� ���� 
//					
//					String �������� = new String( ����Ʈ , 0 , ����Ʈ����);
//						// 3. �о�� ����Ʈ �迭�� ���ڿ��� ��ȯ : 0���� ����Ʈ��������
//					
//					System.out.println("[ �޼��� �ޱ� ���� ] : " + �������� );
//							
//					socket.close();
//					�ޱ�.close();
//					������.close();
				}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	} 
	
}
