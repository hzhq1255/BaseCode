package work.hzhq1255.design.pattern.creation.factory;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class LocalDateFactoryTest {

    @Test
    void formInt() {
        int yyyyMMdd = 20230402;
        LocalDate localDate = LocalDateFactory.formInt(yyyyMMdd);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        String actual = localDate.format(dateTimeFormatter);
        String expected = String.valueOf(yyyyMMdd);
        assertEquals(expected, actual);
    }
}
