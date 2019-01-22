
public class AlarmClock {
	private boolean alarmStatus;
	
	public AlarmClock()
	{
		this.alarmStatus = false;
	}
	
	public boolean checkAlarm()
	{
		return this.alarmStatus;
	}
	
	public void beep()
	{
		System.out.println("Alarm is beeping...");
	}
}
