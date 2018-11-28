package Y_exam;

public class TimeTest {
	public static void main(String[] args) {
		
		Time t = new Time();
		t.setHour(4);
		int hour = t.getHour();
		System.out.println(hour);
		
		t.setMinute(150);
//		hour = t.getHour();
		int minute = t.getMinute();
		System.out.println(t.getHour() +" : " + minute); //6:30
		
		t.setSeconds(10000);
		int seconds = t.getSeconds();
//		System.out.println(hour+" : "+ minute + " : " + seconds); //9 : 36 : 40
		
		
		
		
		
		
	}
}

class Time {
	private int hour;
	private int minute;
	private int second;
	//시간설정
	void setHour(int hour) { //세팅해주다
		if(hour > 23) {
			this.hour = hour%24;
		} else {
			this.hour = hour;
		}
	}
	
	int getHour() {
		return hour;
	}
	
	//분설정
	void setMinute(int minute) {
//		( numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket>0? 1 : 0));
		if(minute>59) { 
			this.hour += minute/60;
			this.minute = minute%60;			
		} else {
			this.minute = minute;
		}
		
	}
	
	int getMinute() {
		return minute;
	}
	
	//초설정
	void setSeconds(int second) {
		if(second > 59) {
				this.second = second%60;
			} else {
				this.second = second;
			}
		}
	
	int getSeconds() {
		return second;
	}
	
	//@Override 
	
}