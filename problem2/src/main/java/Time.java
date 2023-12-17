public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time (int hour, int minute, int second){
        if (checkValidTime(hour, minute, second)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    int getHour() {
        return this.hour;
    }
    int getMinute(){
        return this.minute;
    }
    int getSecond(){
        return this.second;
    }

    private boolean checkValidTime(int hour, int minute, int second) {
        return (hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59) && (second >= 0 && second <= 59);
    }

}

