
public class time {
	private int hour;
	private int minute;
	
	public time(){};
	
	public void setHour(int h){
		this.hour = h;
	}
	
	public void setMinute(int m){
		this.minute = m;
	}
	
	public static void main(String args[]){
		time t = new time();
		t.setHour(3);
		t.setMinute(25);
		System.out.println("The time now is "+t.hour+":"+t.minute);
	}
}
