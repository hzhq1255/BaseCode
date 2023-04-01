package work.hzhq1255.designPattern.creation.abstractFactory;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/2 上午2:02
 */
public interface HtmlDocument {
    String toHtml();

    void save(Path path) throws IOException;
}
