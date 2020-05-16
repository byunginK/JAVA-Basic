package miniProject.copy;

import java.util.ArrayList;

public class ParkController2 {

	public ArrayList<ParkVO> list = new ArrayList<>();
	
	public int size() {
		return list.size();
	}
	public void add(ParkVO p) {
		list.add(p);
	}
	public boolean contains(ParkVO p) {
		return list.contains(p);
	}
	public boolean timesetting(int time) {
		int hour = time /100;
		int minute = time % 100;
		return hour >=0 && hour <=23 && minute>=0 && minute <=59;
	}
	
	
}
