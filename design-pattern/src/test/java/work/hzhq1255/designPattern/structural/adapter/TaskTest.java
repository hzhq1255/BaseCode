package work.hzhq1255.designPattern.structural.adapter;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/2 下午11:34
 */
class TaskTest {

    @Test
    void call() {
        Callable<Long> callable = new Task(1235L);
        // compile error!
        // 只支持 new Thread(Runnable runnable) 构造
        // Thread thread = new Thread(callable);
        // thread.start();

        // 增加 adapter
        Thread thread = new Thread(new RunnableAdapter(callable));
        thread.start();
    }

    @Test
    void asList() {
        String[] strings = new String[]{"This", "is", "an", "apple"};
        // 通过适配器转换
        Set<String> set = new HashSet<>(Arrays.asList(strings));
        System.out.println(set);
    }

    @Test
    void reader() {
        // example
        try {
            InputStream input = Files.newInputStream(Path.of("test.txt"));
            Reader reader = new InputStreamReader(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
