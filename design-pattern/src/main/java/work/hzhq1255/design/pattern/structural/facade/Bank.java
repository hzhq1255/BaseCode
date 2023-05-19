package work.hzhq1255.design.pattern.structural.facade;

import java.util.Random;

/**
 * @author hzhq
 * @version 1.0
 * @implNote 银行
 * @since 2023/5/18 17:04
 */
public class Bank {

    /**
     * 开户
     * @param companyName 公司名称
     * @return 开户id
     */
    public String openAccount(String companyName) {
        Random random = new Random();
        return String.valueOf(random.nextInt(100));
    }
}
