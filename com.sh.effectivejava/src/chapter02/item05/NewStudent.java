package chapter02.item05;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class NewStudent {

    private final Date birthDate;

    private static final Date START_DATE;
    private static final Date END_DATE;

    NewStudent(Date date) {
        birthDate = new Date(date.getTime());
    }

    static {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        calendar.set(1999, Calendar.JANUARY, 1, 0, 0, 0);
        START_DATE = calendar.getTime();

        calendar.set(2002, Calendar.JANUARY, 1, 0, 0, 0);
        END_DATE = calendar.getTime();
    }

    public boolean isHighSchoolStudent() {
        return birthDate.compareTo(START_DATE) >= 0 && birthDate.compareTo(END_DATE) < 0;
    }

}
