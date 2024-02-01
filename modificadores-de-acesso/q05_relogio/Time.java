class Time {
    private int hour   = 0;
    private int minute = 0;
    private int second = 0;

    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void setHour(int hour) {
        if(hour > 23){
            System.out.println("fail: hora invalida");
        } else{
            this.hour = hour;
        }
    }
    public void setMinute(int minute) {
        if(minute > 59){
            System.out.println("fail: minuto invalido");
        } else{
            this.minute = minute;
        }
    }
    public void setSecond(int second) {
        if(second > 59){
            System.out.println("fail: segundo invalido");
        } else{
            this.second = second;
        }
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public int nextSecond() {
    second++;
    if (second >= 60) {
        second = 0;
        minute++;
        if (minute >= 60) {
            minute = 0;
            hour++;
            if (hour >= 24) {
                hour = 0;
            }
        }
    }
    return second;
}

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
