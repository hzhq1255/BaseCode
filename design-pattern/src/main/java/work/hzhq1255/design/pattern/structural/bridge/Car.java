package work.hzhq1255.design.pattern.structural.bridge;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/2 下午11:59
 */
public abstract class Car {

    // 引用 engine
    protected Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void drive();
}
