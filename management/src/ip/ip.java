package ip;

import java.net.InetAddress;

public class ip {

	// ��Ʈ��ũ : ���ͳ�
		// ���ͳ� : pc���� ���
			// �ʼ� : ip ???????
	// ip : ���ͳ� �������� Internet Protocol address
		// �������� ??? => �Ծ�
			// ip�������� : ip ����Ҷ� ���ѾߵǴ� ��Ģ
				// �ٸ����� : �ٸ�pc�� ip�ּ� �Է��ؼ� ����[���]
	
	// �� : ���ּ� 
		// ���ּ� ��Ģ => �����ȣ ���θ�
			// ���� : ���ּ� �Է��ؼ� ���� ������
	
	// �� ��ǻ���� ip????? : ��/�������� = ip�ڵ��Ҵ�[ DHCP ]
		
	// ���̹� Ȩ������ ���� ???? : https://www.naver.com => �������ּ�
		// ��ǻ�� [ 0,1 = ���� ] == ��� [ ���� ]
		// 	ip �ּ�				== ���� �ּ�[ ������ �ּ� ] 			 
	
	
	
	public static void main(String[] args) {
		
		try {
			
			// ��pc
			InetAddress mypc = InetAddress.getLocalHost();
				// InetAddress ���ͳ� ip ���� Ŭ����
					// .getLocalHost() ���� ����� ȣ��Ʈ[pc] ��������
			System.out.println(" �� pc�� �̸� " + mypc.getHostName());
			System.out.println(" �� pc�� ip�ּ� " + mypc.getHostAddress());
			
			
			// ���̹� ip�ּ� �˾ƺ��� => �迭 [ ip �ּ� 2�� ]
			InetAddress[] naverpc = InetAddress.getAllByName("www.naver.com");
			
			System.out.println(" ���̹� pc �� �̸� : " + naverpc[0].getHostName());
			System.out.println(" ���̹� pc �� ip�ּ� : " + naverpc[0].getHostAddress());
			
			System.out.println(" ���̹� pc2 �� �̸� : " + naverpc[1].getHostName());
			System.out.println(" ���̹� pc2 �� ip�ּ� : " + naverpc[1].getHostAddress());
			
			// ���� ip�ּ� �˾ƺ���
			InetAddress googlepc = InetAddress.getByName("www.google.com");
			
			System.out.println(" ���� pc �� �̸� : " + googlepc.getHostName());
			System.out.println(" ���� pc �� ip�ּ� : " + googlepc.getHostAddress());
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
