package work.hzhq1255.design.pattern.creation.singleton;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/2 下午10:33
 * 通过枚举实现单例
 */
public enum World {
    // 唯一枚举
    INSTANCE;

    private Singleton singleton = Singleton.getInstance();

    public Singleton getSingleton() {
        return singleton;
    }
}
