package work.hzhq1255.designPattern.creation.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/2 下午10:37
 */
class SingletonTest {

    @Test
    void getSingleton() {
        // 单例
        Singleton singleton = Singleton.getInstance();
        // 枚举单例
        Singleton enumSingleton = World.INSTANCE.getSingleton();
        assertEquals(enumSingleton, singleton);
    }
}
