package day20210501.Thread.ex03;

public class Horse implements Runnable {
	String name;
	public Horse(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public void HorseRun() {
		System.out.println(name + "말이 출발했습니다.");
		try {		
			int second = (int)(Math.random()*9 +2);
		//	System.out.println(second);
			Thread.sleep(second*1000);
			System.out.println(name + "말이 도착했습니다.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void run() {
		HorseRun();
	}
}
