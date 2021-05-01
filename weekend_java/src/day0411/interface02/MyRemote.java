package day0411.interface02;

public class MyRemote {
	RemoteController rc;
	
	void setRemoteController(RemoteController rc) {
		this.rc = rc;
	}
	
	public void on() {
		rc.turnOn();
	}
	
	public void off() {
		rc.turnOff();
	}
}
