package work.hzhq1255.designPattern.creation.singleton;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/2 下午10:28
 * 单例模式
 */
public class Singleton {

    // 静态变量引用唯一实例
    private static final Singleton INSTANCE = new Singleton();

    public static Singleton getInstance(){
        return INSTANCE;
    }

    // 只能通过 静态变量方法获取 无法通过构造方法获取
    private Singleton(){
    }
}
