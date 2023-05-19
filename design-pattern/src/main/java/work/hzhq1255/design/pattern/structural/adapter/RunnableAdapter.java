package work.hzhq1255.design.pattern.structural.adapter;

import java.util.concurrent.Callable;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/2 下午11:40
 */
public class RunnableAdapter implements Runnable {

    // 引用待转换接口
    private Callable<?> callable;

    public RunnableAdapter(Callable<?> callable) {
        this.callable = callable;
    }

    @Override
    public void run() {
        try {
            // 调用委托接口进行转换
            callable.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
