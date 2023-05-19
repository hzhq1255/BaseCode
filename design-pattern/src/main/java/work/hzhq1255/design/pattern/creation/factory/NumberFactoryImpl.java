package work.hzhq1255.design.pattern.creation.factory;

import java.math.BigDecimal;

public class NumberFactoryImpl implements NumberFactory {

    @Override
    public Number parse(String value) {
        return new BigDecimal(value);
    }

}
