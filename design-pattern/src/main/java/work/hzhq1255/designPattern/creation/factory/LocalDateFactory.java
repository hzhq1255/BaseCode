package work.hzhq1255.designPattern.creation.factory;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.logging.SimpleFormatter;

public class LocalDateFactory {

    /**
     * 从数字转成时间
     * @param yyyyMMdd yyyyMMdd 的数字
     * @return 转换后的时间
     */
    public static LocalDate formInt(int yyyyMMdd) {
        String date = String.valueOf(yyyyMMdd);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyyMMdd");
        return LocalDate.parse(date, format);
    }
}
