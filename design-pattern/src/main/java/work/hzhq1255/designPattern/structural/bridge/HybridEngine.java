package work.hzhq1255.designPattern.structural.bridge;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/3 上午12:04
 */
public class HybridEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Start Hybrid Engine...");
    }
}
