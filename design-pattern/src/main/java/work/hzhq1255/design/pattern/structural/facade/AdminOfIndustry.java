package work.hzhq1255.design.pattern.structural.facade;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/5/18 16:54
 * @implNote 工商注册类
 */
public class AdminOfIndustry {
    public Company register(String name) {
        Company company = new Company();
        company.setName(name);
        return company;
    }
}
