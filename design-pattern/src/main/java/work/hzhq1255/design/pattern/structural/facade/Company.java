package work.hzhq1255.design.pattern.structural.facade;

import lombok.Data;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/5/18 16:54
 * 公司实体类
 */
@Data
public class Company {
    /**
     * 公司名称
     */
    private String name;
    /**
     * 纳税号
     */
    private String taxCode;
    /**
     * 银行账号
     */
    private String bankAccount;
}
