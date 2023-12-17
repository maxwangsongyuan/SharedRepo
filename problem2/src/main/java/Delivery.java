public class Delivery {

    private String startLocation;
    private String endLocation;
    private Time startTime;
    private Time endTime;

    public Delivery (String startLocation, String endLocation, Time startTime, Time endTime){
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    String getStartLocation(){
        return this.startLocation;
    }
    String getEndLocation(){
        return this.endLocation;
    }
    Time getStartTime(){
        return this.startTime;
    }
    Time getEndTime(){
        return this.endTime;
    }

    public Time getDuration() {
        int durationHour = endTime.getHour() - startTime.getHour();
        int durationMinute = endTime.getMinute() - startTime.getMinute();
        int durationSecond = endTime.getSecond() - startTime.getSecond();

        if (durationSecond < 0) {
            durationSecond += 60;
            durationMinute--;
        }

        if (durationMinute < 0) {
            durationMinute += 60;
            durationHour--;
        }

        if (durationHour < 0) {
            durationHour += 24;
        }

        return new Time(durationHour, durationMinute, durationSecond);
    }


}
