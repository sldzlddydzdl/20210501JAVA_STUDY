package java2_16;

import java.awt.*;


public class java2_1 {

	// ������ ????
		// �ڵ�[��ɾ�] : java �ڵ� 
		// ���μ���[���α׷�] : �ڵ� ����
			// ������ : �ڵ� ó��
				// main �޼ҵ� : main ������ ���� // ���� �۾� // ���� �۾�
	
			// ��Ƽ������[ ��Ƽ�۾� ] : ���� �۾�
				// ����?????? (��ǻ�ʹ� ���� ��) : �������� �����带 �ϳ��� ���ư��鼭 �ڵ� ó��
					// ���� ���� ó��?? => CPU �����ٸ� : JAVA���� �켱���� �� ���Ҽ� ����. (���Ҽ� �մ� �޼ҵ尡 �ձ��ѵ�)
															// �Ϲ������δ� �켱���Ǹ� ���Ҽ� ����.
															// ���� CPU�� �˾Ƽ� �������� ��ó�������� ����
	
			// ������ ������
				// 1. Thread : Ŭ���� ���
				// 2. Runnable : �������̽� ���
					// ���� [ ���� ���� ] : extends 1�� ��� ���� // implements ������ ��� ���� 
					// �Ϲ������� Runnable �������̽��� ���� ���!!
	
			// ������ ������
				// 1. run �޼ҵ� �������̵� [ ��Ƽ�����忡�� ������ �ڵ� ���� ]
				// 2. start �޼ҵ� : start() �޼ҵ�� run() �޼ҵ带 ȣ���ϴ� �޼ҵ��̴�.
				
			// ������ �̸�Ȯ�� [ ���� �߻��� ���� �߻��� �������� ��ġ�� ã�ƾ��ؼ� ������ �̸��� Ȯ���Ѵ� ]
				// 1. �������.getName()
	
		// ����6
			// ����ȭ : synchronized <- ��Ƽ�����忡�� ��� ( ���Ͻ����忡���� ��������� �����̾��� )
				// synchronized : ���� ���� ���� [ 1���� �����徿 ó�� ]
					// �ڿ�[�޸�] ȿ����[���ϼ�] ���� �����ϱ� ���ؼ�
	
		// ����7
			// ������ �����·� ������
				// Thread.yield()
	
		// ����8
			// �ش� �������� ���� ������� ��ٸ���
					// .join()
	
	public static void main(String[] args) {
		
		/*
		// ���� 1 : ���� ������ : ������ �Ʒ��� �ڵ� ������� ó��
		System.out.println("���Ͻ����� ����");
		Toolkit �� = Toolkit.getDefaultToolkit();
		
		for(int  i = 0 ; i < 5 ; i++) {
			��.beep(); // ������ �߻� 
			
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

			}
					// Thread.sleep( �и��� ) : �и��ʵ��� �Ͻ�����
		}
		
		for(int i = 0 ; i < 5 ; i ++) {
			System.out.println("��");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
		
			}
		}
	
		// ���� 2 : ��Ƽ ������ : �����۾� // Runnable : �������̽������
			System.out.println("��Ƽ������ ����");
		Runnable �Ҹ� = new �Ҹ�();
		Thread ��Ƽ������ = new Thread(�Ҹ�);
		
		��Ƽ������.start();
		
		for(int i = 0 ; i < 5; i++) {
			
			System.out.println("��");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
			
		}
		
		// ���� 3 : ��Ƽ ������ : ���� �۾�  // ThreadŬ���� ����ؼ� extends
		System.out.println(" ��Ƽ������2 ����");
		
		Thread ��Ƽ������2 = new �Ҹ�2();
		��Ƽ������2.start();
		
		for(int i = 0 ; i < 5; i++) {
			System.out.println("��2");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		
		*/
		// ���� 4 : ������ �̸�
		
		
		// ����1 
		
		/*
			// ������ Ŭ���� ���� , ����
		Thread thread = new ����������();
		thread.start();
	
			
			// Runnable �������̽� ���� , ����
		Runnable �� = new ���ǽ�����();
		Thread ������ = new Thread(��);
		������.start();
		
		Thread thread3 = new Thread(new ���ǽ�����());
		thread3.start();
		
		Runnable runnable2 = new  Runnable() {
			public void run() {
			
				for(int i = 0 ; i < 3; i++) {
					System.out.println("������4����");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		};
		
		Thread thread4 = new Thread(runnable2);
		thread4.start();
		
		System.out.println(" ===== main �� ==== ");
		*/
		
		
		
		// ���� 5 : ������ �켱����
			// ��ó������ : cpu �����ٸ� �� ���Ѵ�. �츮�� ���ϴ°� �ƴϴ�.
		
		/*
		for(int i = 0 ; i < 10; i++) {
			
			Thread thread = new �۾�������();
		
			// �츮�� ���Ƿ� �켱���̸� ���Ҽ����ִ�.
			// Thread.MIN_PRIORITY => �����带 �ֿ켱���� ����
			// Thread.MAX_PRIORITY => �����带 ���ķ� ����
			if( i != 9) {
				thread.setPriority(Thread.MIN_PRIORITY);
			}
			else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			
			thread.start();
			
			
		}
		
		
		// ���� 6 : ����ȭ ???
			// synchronized (�߿�!!) : �Ѱ��� �����常 ���� ������ �޼ҵ�
							// �ϳ��� �����尡 ���������� ���� ������� ��޸����ؼ� �ٸ������尡 ���ٸ��ϰ���
		
		
		���� ���� = new ����();
		
		����1 ����1 = new ����1();
		����1.set����(����);
		����1.start();
		
		����2 ����2 = new ����2();
		����2.set����(����);
		����2.start();
		
		*/
		
		// ���� 7 : �纸 [ �纸���ٴ� ������ �����带 �����·� ������ ] : Thread.yield()
		
		/*
		������C ������C = new ������C();
		������D ������D = new ������D();
		
		������C.start();
		������D.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		������C.work = false;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		
		������C.work = true;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		
		������C.stop = true;
		������D.stop = true;
		*/
		
		
		// ���� 8 : ���� ��ٸ�
			// �ٸ� ������ ����Ǳ����� main �����Ƿ� 
			// Thread�� ��ӹ��� �հ迡 join�� ȣ���ϸ� main�����带 �Ͻ������Ѵ�
		
		/*
		�հ� �հ� = new �հ�();
		�հ�.start();
		
		try {
			�հ�.join(); // main ������ �Ͻ����� 
						// �հ� �����尡 ������ ���� ��޷��ش�
						// �Ͻ������� ���䵵 ������ main + �հ轺���� = �ΰ��� ������ ���� �Ѿ�ٴ� ���̴�.
						// �׷��� �Լ��� �̸��� join() �̴�.
		} catch (InterruptedException e) {

		}
		
		System.out.println("1 ~ 100 ���� �� �� : " + �հ�.sum);
		*/
		
		/*
		Runnable ���� = new ����();
		Thread thread1 =  new Thread(����);
		��ȭ ��ȭ = new ��ȭ();
		*/
		
		���� ���� = new ����();
		Runnable runnable = new ����();
		Thread thread =  new Thread( runnable );
		
		
		��ȭ thread2 = new ��ȭ();
		
		thread.start();
		thread2.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
	
		����.work = false;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		����.work = true;
		thread2.stop = false;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		thread.stop(); // ������ ���� : ����x => �޸𸮰� �ȳ��󰣴�
		
		
		thread2.stop = false;
		
		System.out.println("main ����");
		
		/*
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
		}
		
		thread2.start();
		thread2.stop = false;
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
		
		
}
