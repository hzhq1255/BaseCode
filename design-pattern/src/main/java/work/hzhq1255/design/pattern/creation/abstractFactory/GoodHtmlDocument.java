package work.hzhq1255.design.pattern.creation.abstractFactory;

import java.io.IOException;
import java.nio.file.Path;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/2 上午2:16
 */
public class GoodHtmlDocument implements HtmlDocument {

    private String md;

    public GoodHtmlDocument(String md) {
        this.md = md;
    }

    @Override
    public String toHtml() {
        return "<div>" + md + "</div>";
    }

    @Override
    public void save(Path path) throws IOException {
        System.out.println("save " + toHtml() + " to " + path.toAbsolutePath());
    }
}
