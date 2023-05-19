package work.hzhq1255.design.pattern.structural.facade;

import java.util.Random;

/**
 *
 *
 * @author hzhq
 * @version 1.0
 * @since 2023/5/18 17:04
 * @implNote
 *   税务
 */
public class Taxation {

    public String applyTaxCode(String companyName){
        return String.valueOf(new Random().nextInt(1000));
    }
}
