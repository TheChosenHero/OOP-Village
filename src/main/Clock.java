package main;

public class Clock extends Thread{
	int time;
	Village village;
	
	public Clock (Village village) {
		this.village = village;
	}
	
	public synchronized void run() {
		while(true) {
			time++;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public int getTime() {
		return time;
	}
	public void printTime() {
		Village.ui.print("time: " + time);
	}

}
