package work.hzhq1255.designPattern.creation.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/2 上午2:51
 */
class URLBuilderTest {

    @Test
    void build() {
        String url = URLBuilder.builder()
                .domain("www.baidu.com")
                .scheme("https")
                .path("/s")
                .query(new LinkedHashMap<>() {{
                    put("wd", "test");
                    put("ie", "utf-8");
                }})
                .build();
        String expected = "https://www.baidu.com/s?wd=test&ie=utf-8";
        Assertions.assertEquals(expected, url);
    }
}
