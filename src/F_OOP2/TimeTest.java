package F_OOP2;

public class TimeTest {
	public static void main(String[] args) {
		
		Time t = new Time();
		t.setHour(4);
		int hour = t.getHour();
		System.out.println(hour);
		
		t.setMinute(150);
//		int hour2 = t.getHour();
		int minute = t.getMinute();
		System.out.println(t.getHour() +" : " + minute); //6:30
		
		t.setSeconds(10000);
//		int hour3 = t.getHour();
//		int minute2 = t.getMinute();
		int seconds = t.getSeconds();
		System.out.println(t.getHour()+" : "+ t.getMinute()+ " : " + seconds); //9 : 16 : 40
		
	}
}

class Time {
	private int hour;
	private int minute;
	private int second;
	//시간설정
	void setHour(int hour) { //세팅해주다
		this.hour = hour%24;
	}
	
	int getHour() {
		return hour;
	}
	
	//분설정
	void setMinute(int minute) {
		setHour(this.hour+minute/60);
		this.minute = minute%60;			
	}
	
	int getMinute() {
		return minute;
	}
	
	//초설정
	void setSeconds(int second) {
		setMinute(this.minute+second/60);
		this.second = second%60;
	}
	
	int getSeconds() {
		return second;
	}
	
}

class MemberVo {
	String mem_id;
	String mem_pass;
	String mem_add1;
	String mem_add2;
	
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_pass() {
		return mem_pass;
	}
	public void setMem_pass(String mem_pass) {
		this.mem_pass = mem_pass;
	}
	public String getMem_add1() {
		return mem_add1;
	}
	public void setMem_add1(String mem_add1) {
		this.mem_add1 = mem_add1;
	}
	public String getMem_add2() {
		return mem_add2;
	}
	public void setMem_add2(String mem_add2) {
		this.mem_add2 = mem_add2;
	}
}