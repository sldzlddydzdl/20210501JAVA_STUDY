package java2_12;

public interface ATM {
	
	// 1. interface �� �������� �ȵȴ� , // ����� �ȴ�
		// int maxmoney;
	int maxmoney = 1000000;
	
	// 2. �߻�޼ҵ� : ���ǵ����ʴ� �޼ҵ� ����
	
	public void ��ũ�޴�();
	public void ���»���(); // 1
	public void �Ա�(); // 2
	public void ���(); // 3
	public void �ܰ�(); // 4
	public void ���¸��(); //6
	
	// 3.default : �޼ҵ带 �����ؾ��Ѵ�.! 
	default int ����(int �����ڵ�) {
		
		return 0;
		
	}
	
	
}
