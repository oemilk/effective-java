package chapter02.item05;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Student {

    private final Date birthDate;

    Student(Date date) {
        birthDate = new Date(date.getTime());
    }

    public boolean isHighSchoolStudent() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        calendar.set(1999, Calendar.JANUARY, 1, 0, 0, 0);
        Date startDate = calendar.getTime();

        calendar.set(2002, Calendar.JANUARY, 1, 0, 0, 0);
        Date endDate = calendar.getTime();

        return birthDate.compareTo(startDate) >= 0 && birthDate.compareTo(endDate) < 0;
    }

}
