// let's get this money

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

public class DateCheckerTest {

    DateChecker dateChecker = new DateChecker();

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {
            "JANUARY", "MARCH", "MAY", "JULY",
            "AUGUST", "OCTOBER", "DECEMBER"
    })
    public void testHas31Days(DateChecker.Month month) {
        assertTrue(dateChecker.has31Days(month));
    }

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {
            "FEBRUARY", "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"
    })
    public void testDoesNotHave31Days(DateChecker.Month month) {
        assertFalse(dateChecker.has31Days(month));
    }

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {
            "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"
    })
    public void testHasExactly30Days(DateChecker.Month month) {
        assertTrue(dateChecker.exactly30Days(month));
    }

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {
            "JANUARY", "FEBRUARY", "MARCH", "APRIL",
            "MAY", "JUNE", "JULY", "AUGUST",
            "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"
    })
    public void testIsFebruary(DateChecker.Month month) {
        assertTrue(dateChecker.isFebruary(month));
    }

}
