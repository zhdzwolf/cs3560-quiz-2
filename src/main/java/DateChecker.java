// final fantasy viii

import java.util.Arrays;

public class DateChecker {

    enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    private final DateChecker.Month[] monthThirtyOneDays = {
            Month.JANUARY, Month.MARCH, Month.MAY,
            Month.JULY,Month.AUGUST, Month.OCTOBER, Month.DECEMBER
    };

    private final DateChecker.Month[] monthThirtyDays = {
            Month.APRIL, Month.JUNE, Month.SEPTEMBER, Month.NOVEMBER
    };

    private final DateChecker.Month[] monthTwentyEightDays = {
            Month.FEBRUARY
    };

    public boolean has31Days(Month month) {
        if (Arrays.asList(monthThirtyOneDays).contains(month)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean exactly30Days(Month month) {
        if (Arrays.asList(monthThirtyDays).contains(month)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFebruary(Month month) {
        if (Arrays.asList(monthTwentyEightDays).contains(month)) {
            return true;
        }
        else {
            return false;
        }
    }

}
