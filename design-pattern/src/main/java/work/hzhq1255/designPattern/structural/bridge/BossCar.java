package work.hzhq1255.designPattern.structural.bridge;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/3 上午12:03
 */
public class BossCar extends RefinedCar{
    public BossCar(Engine engine) {
        super(engine);
    }

    @Override
    public String getBrand() {
        return "Boss";
    }
}
