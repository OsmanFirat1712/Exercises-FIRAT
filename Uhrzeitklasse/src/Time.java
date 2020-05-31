public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time() {
        // TODO Auto-generated constructor stub
    }

    public Time subtract(Time t2, Time t3) {
        t2.hour = t2.hour - t3.hour;
        t2.minute = t2.minute - t3.minute;
        t2.second = t2.second - t3.second;

        return t2;
    }

    @Override
    public String toString() {
    	System.out.printf("%02d:%02d:%02d\n", hour, minute,second);
        return hour + ":" + minute + ":" + second;
    }



}