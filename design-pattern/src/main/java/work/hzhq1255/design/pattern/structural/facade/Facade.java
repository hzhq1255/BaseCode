package work.hzhq1255.design.pattern.structural.facade;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/5/18 17:29
 */
public class Facade {

    private final AdminOfIndustry admin;


    private final Bank bank;

    private final Taxation taxation;

    public Facade(AdminOfIndustry admin, Bank bank, Taxation taxation) {
        this.admin = admin;
        this.bank = bank;
        this.taxation = taxation;
    }

    public Company openCompany(String companyName) {
        Company c = this.admin.register(companyName);
        String bankAccount = this.bank.openAccount(companyName);
        c.setBankAccount(bankAccount);
        String taxCode = this.taxation.applyTaxCode(companyName);
        c.setTaxCode(taxCode);
        return c;
    }

    public static void main(String[] args) {
        Facade f = new Facade(new AdminOfIndustry(), new Bank(), new Taxation());
        Company company = f.openCompany("test-company");
        System.out.println(company.toString());
    }
}
