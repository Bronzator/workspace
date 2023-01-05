package Ch8Classes;

public class DOB {
    //fields

    private int year,month,day;

    public DOB(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return   month +
                "/" + day +
                "/" + year + "\n";
    }
}
