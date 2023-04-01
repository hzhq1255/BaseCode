package work.hzhq1255.designPattern.creation.abstractFactory;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/2 上午2:19
 */
public class GoodWordDocument implements WordDocument {

    private String md;

    public GoodWordDocument(String md) {
        this.md = md;
    }

    @Override
    public void save(Path path) throws IOException {
        System.out.println("save " + md + " to " + path.toAbsolutePath());
    }
}
