package work.hzhq1255.designPattern.creation.abstractFactory;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/2 上午2:33
 */
class AbstractFactoryTest {

    @Test
    void createFactory() throws IOException {
        String md = "# Title";
        AbstractFactory fastFactory = AbstractFactory.createFactory("fast");
        fastFactory.createHtml(md).save(Path.of("fast.html"));
        fastFactory.createWord(md).save(Path.of("fast.word"));
        AbstractFactory goodFactory = AbstractFactory.createFactory("good");
        goodFactory.createHtml(md).save(Path.of("good.html"));
        goodFactory.createWord(md).save(Path.of("word.html"));
    }
}
