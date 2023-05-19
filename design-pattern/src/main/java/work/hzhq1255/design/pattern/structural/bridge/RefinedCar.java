package work.hzhq1255.design.pattern.structural.bridge;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/3 上午12:01
 */
public abstract class RefinedCar extends Car {
    public RefinedCar(Engine engine) {
        super(engine);
    }

    public void drive(){
        this.engine.start();
        System.out.println("Drive " + getBrand() + " car...");
    }

    public abstract String getBrand();
}
