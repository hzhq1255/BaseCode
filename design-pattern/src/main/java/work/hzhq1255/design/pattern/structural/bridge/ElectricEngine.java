package work.hzhq1255.design.pattern.structural.bridge;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/3 上午12:06
 */
public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Start Electric Engine...");
    }
}
