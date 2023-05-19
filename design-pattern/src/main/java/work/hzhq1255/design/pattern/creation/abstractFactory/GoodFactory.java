package work.hzhq1255.design.pattern.creation.abstractFactory;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/2 上午2:15
 */
public class GoodFactory implements AbstractFactory {
    @Override
    public HtmlDocument createHtml(String md) {
        return new GoodHtmlDocument(md);
    }

    @Override
    public WordDocument createWord(String md) {
        return new GoodWordDocument(md);
    }
}
