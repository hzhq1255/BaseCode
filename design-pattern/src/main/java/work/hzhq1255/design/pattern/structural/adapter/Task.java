package work.hzhq1255.design.pattern.structural.adapter;

import java.util.concurrent.Callable;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/2 下午11:32
 */
public class Task implements Callable<Long> {

    private long num;

    public Task(long num) {
        this.num = num;
    }



    @Override
    public Long call() throws Exception {
        long r = 0;
        for (long n = 1; n <= this.num; n++) {
            r += n;
        }
        System.out.println("result: " + r);
        return r;
    }
}
