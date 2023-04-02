package work.hzhq1255.designPattern.structural.bridge;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/3 上午12:06
 */
public class BigCar extends RefinedCar{

    public BigCar(Engine engine) {
        super(engine);
    }

    @Override
    public String getBrand() {
        return "Big";
    }
}
