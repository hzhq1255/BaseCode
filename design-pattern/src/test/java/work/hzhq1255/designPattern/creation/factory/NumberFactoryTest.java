package work.hzhq1255.designPattern.creation.factory;

import org.junit.jupiter.api.Test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.*;

class NumberFactoryTest {

    @Test
    void parse() {
        // 获取工厂类
        NumberFactory numberFactory = NumberFactory.getFactory();
        // 调用方忽略实现的工厂和实际产品 BigDecimal
        // 产品不停变换都不会影响到调用方
        Number actual = numberFactory.parse("123.456");
        Number expected = 123.456d;
        assertEquals(actual.doubleValue(), expected.doubleValue());


    }

    @Test
    void staticParse() {
        // 或者直接调用静态工厂方法
        Number actual = NumberFactory.staticParse("123.456");
        Number expected = 123.456d;
        assertEquals(actual.doubleValue(), expected.doubleValue());
    }

    @Test
    void testMessageDigest() throws NoSuchAlgorithmException {
        // 如信息摘要 创建不同算法
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
    }

}
