package Part2.section1.ch10;

public class BirthDay  {
    private int day;
    private int month;
    private int year;
    // command + n get,set 자동

    private boolean isValid;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
        if( month < 13){
            isValid=true;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void showData() {
        if (isValid) {
            System.out.println(year +" " +month+" " + day);
        }
        else
        {
            System.out.println("data가 없습니다.");
        }
    }
}
