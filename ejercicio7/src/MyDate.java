import java.util.Arrays;

public class MyDate {
    private int year;
    private int month;
    private int day;


    private String strMonths[] = {"Jan", "Feb", "Mar", "App", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    private String strDays[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "thursday", "Friday", "Friday", "Saturday"};

    private int daysInMonths[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean isLeapYear(int year) {
        boolean flag = false;
        if (this.year % 4 == 0) {
            flag = true;
        } else if (this.year % 4 == 0 && this.year % 100 == 0) {
            flag = false;
        } else if (this.year % 4 != 0) {
            flag = false;
        }
        return flag;
    }

    public boolean isValidDate(int year, int month, int day) {
        boolean bool = false;
        if (this.year > 0 && (month > 0 && month < 12) && (day > 0 && day < 32)) {
            if (year % 4 == 0) {
                daysInMonths[1] = 29;
            } else if (year % 4 == 0 && year % 100 == 0) {
                daysInMonths = daysInMonths;
            }
            if (day <= daysInMonths[month - 1]) {
                bool = true;
            } else {
                bool = false;
            }
        }
        return bool;
    }

    public int getDayOfWeek(int year, int month, int day) {
        if (day <= daysInMonths[month - 1]) {
            System.out.print(daysInMonths[month - 1] + "/");
            System.out.print(strMonths[month - 1] + "/");
            System.out.print(year);
        } else {
            System.out.println("Error, la fecha no existe");
        }

        return 0;
    }

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month ;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                               '}';
    }

    public MyDate NextDay() {
        if (getDay() == 31 && getMonth()==12) {
            this.day = 1;
            this.month += 1;
            this.year += 1;
        } else if (getDay()==31 && ( (getMonth() == 1) || (getMonth() == 3) || (getMonth() == 5) || (getMonth() == 7) || (getMonth() == 8)|| (getMonth() == 10)) ){
            this.day = 1;
            this.month += 1;
        }else if (getDay()>0 && getDay()<31){
            this.day+=1;
        }
        else if (getDay() == 30 && ((getMonth() == 3) || (getMonth() == 5) || (getMonth() == 8) || (getMonth() == 10))) {
            this.day = 1;
            this.month += 1;
        } else if (getDay() == 28 && getMonth() == 2) {
            this.day = 1;
            this.month += 1;
        } else if (getDay() == 30) {
            this.day += 1;
        } else if (getDay() == 28) {
            this.day += 1;
        }
        MyDate myDate = new MyDate(this.year, this.month, this.day);
        return myDate;

    }

    public MyDate NextMonth() {
        if (this.month == 12) {
            this.month = 1;
            this.year+=1;
        } else {
            this.month += 1;
        }
        MyDate myDate = new MyDate(this.year, this.month, this.day);
        return myDate;
    }

    public MyDate NextYear() {
        this.year += 1;
        MyDate myDate = new MyDate(this.year, this.month, this.day);
        return myDate;
    }

    public MyDate PreviousDay() {

        if (getDay() == 1 && ( (getMonth() == 2)||(getMonth() == 4) || (getMonth() == 6) || (getMonth() == 9) || (getMonth() == 11))) {
            this.day = 31;
            this.month -= 1;
        }else if (getDay()==1 && getMonth()==1){
            this.day=31;
                this.month=12;
                this.year-=1;
        } else if (getDay() == 1 && getMonth() == 3) {
            this.day = 28;
            this.month -= 1;
        } else if (getDay() == 1 && (  (getMonth() == 5) || (getMonth() == 7) || (getMonth() == 10) || (getMonth() == 12))) {
            this.day = 30;
            this.month-=1;
        }else if (getDay()>0 && getDay()<31){
            this.day-=1;
        }
        MyDate myDate = new MyDate(this.year, this.month, this.day);
        return myDate;
    }
    public MyDate PreviousMonth (){
        if(this.month==1){
            this.month=12;
            this.year-=1;
        }else {
            this.month-=1;
        }
        MyDate myDate = new MyDate(this.year, this.month, this.day);
        return myDate;
    }

    public MyDate PreviousYear(){
        this.year-=1;
        MyDate myDate = new MyDate(this.year, this.month, this.day);
        return myDate;
    }

}