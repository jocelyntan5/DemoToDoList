package sg.edu.rp.c346.id22043453.demotodolist;

import java.util.Calendar;
import java.util.Locale;

public class ToDoItem {

    private String title;
    private Calendar date;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }


    @Override
    public String toString() {
        String str = title + "\n" + date.get(Calendar.DAY_OF_MONTH) + "/" + date.get(Calendar.MONTH) + "/"
                + date.get(Calendar.YEAR) + " (" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";
        return str;
    }

    private String getDay(int day) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK, day+1);
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());

        /*
        String dayName = "";
        switch (day) {
            case Calendar.SUNDAY:
                dayName = "Sunday";
                break;
            case Calendar.MONDAY:
                dayName = "Monday";
                break;
            case Calendar.TUESDAY:
                dayName = "Tuesday";
                break;
            case Calendar.WEDNESDAY:
                dayName = "Wednesday";
                break;
            case Calendar.THURSDAY:
                dayName = "Thursday";
                break;
            case Calendar.FRIDAY:
                dayName = "Friday";
                break;
            case Calendar.SATURDAY:
                dayName = "Saturday";
                break;
        }
        return dayName;
         */

    }


}
