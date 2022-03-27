package com.company;

public class Change {
    private final int minhms = 0;
    private final int maxms = 60;
    private final int maxh = 24;
    private int hour;
    private int min;
    private int sek;

    public Change(int hour, int min, int sek) {
        if (hour < minhms && hour > maxh) {
        } else this.hour = hour;
        if (min < minhms && min > maxms) {
        } else this.min = min;
        if (sek < minhms && sek > maxms) {
        } else this.sek = sek;
    }

    @Override
    public String toString() {
        return "com.company.Change{" +
                "hour=" + hour +
                ", min=" + min +
                ", sek=" + sek +
                '}';
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSek() {
        return sek;
    }

    public void setSek(int sek) {
        this.sek = sek;
    }

    public void addSecond(int chahgesek) {
        sek += chahgesek;
        min += sek / 60;
        sek = sek % 60;

        hour += min / 60;
        min = min % 60;
        System.out.println(hour+"ч"+min+"мин"+sek+"сек");

    }

    public void addMinute(int chahgemin) {
        addSecond(chahgemin * 60);
        System.out.println(hour+"ч"+min+"мин"+sek+"сек");
    }

    public void addHour(int chagehour) {
        addSecond(chagehour * 60 * 60);
        System.out.println(hour+"ч"+min+"мин"+sek+"сек");
    }

}
