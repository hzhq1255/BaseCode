package work.hzhq1255.design.pattern.structural.bridge;

import org.junit.jupiter.api.Test;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/3 上午12:05
 */
class CarTest {

    @Test
    void drive() {
        // Boss car , Hybrid engine
        RefinedCar bossHybridCar = new BigCar(new HybridEngine());
        bossHybridCar.drive();
        // Big car , Electric engine
        RefinedCar bigElectricCar = new BigCar(new ElectricEngine());
        bigElectricCar.drive();

    }
}
