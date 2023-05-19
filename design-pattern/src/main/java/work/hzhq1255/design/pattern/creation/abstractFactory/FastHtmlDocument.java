package work.hzhq1255.design.pattern.creation.abstractFactory;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/2 上午2:06
 */
public class FastHtmlDocument implements HtmlDocument {

    private String md;

    public FastHtmlDocument(String md) {
        this.md = md;
    }

    @Override
    public String toHtml() {
        return String.format("<p>%s</p>", md);
    }

    @Override
    public void save(Path path) throws IOException {
        System.out.println("save  " + toHtml() + " to " + path.toAbsolutePath());
    }
}
