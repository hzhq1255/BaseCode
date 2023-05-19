package work.hzhq1255.design.pattern.creation.factory;

import java.math.BigDecimal;

/**
 * number factory
 */
public interface NumberFactory {

    // 创建方法
    Number parse(String value);

    static Number staticParse(String value) {
        if (null == value) {
            return 0;
        }
        return new BigDecimal(value);
    }

    // 创建工厂实例
    static NumberFactory getFactory() {
        return new NumberFactoryImpl();
    }
}
