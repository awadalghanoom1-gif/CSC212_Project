package project;

public class DateTime implements IDateTime {
	private final int year;
	private final int month;
	private final int day;
	private final int hour;
	private final int minute;

	public DateTime(int year, int month, int day, int hour, int minute) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
	}

	@Override
	public int getYear() {
		return year;
	}

	@Override
	public int getMonth() {
		return month;
	}

	@Override
	public int getDay() {
		return day;
	}

	@Override
	public int getHour() {
		return hour;
	}

	@Override
	public int getMinute() {
		return minute;
	}

	@Override
	public String format() {
		return String.format("%02d/%02d/%04d %02d:%02d", month, day, year, hour, minute);
	}

	@Override
	public int compareTo(IDateTime other) {
		if (year != other.getYear()) {
			return Integer.compare(year, other.getYear());
		}
		else if (month != other.getMonth()) {
			return Integer.compare(month, other.getMonth());
		}
		else if (day != other.getDay()) {
			return Integer.compare(day, other.getDay());
		}
		else if (hour != other.getHour()) {
			return Integer.compare(hour, other.getHour());
		}
		else if (minute != other.getMinute()) {
			return Integer.compare(minute, other.getMinute());
		}
		return 0;

	}

	public static DateTime parse(String s) {
		String[] parts = s.trim().split(" ");   
		String[] date = parts[0].split("/");
		String[] time = parts[1].split(":");  

		int month  = Integer.parseInt(date[0]);
		int day    = Integer.parseInt(date[1]);
		int year   = Integer.parseInt(date[2]);
		int hour   = Integer.parseInt(time[0]);
		int minute = Integer.parseInt(time[1]);

		return new DateTime(year, month, day, hour, minute);
	}
}

