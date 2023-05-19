package work.hzhq1255.design.pattern.creation.abstractFactory;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/2 上午2:07
 * 实际生产的工厂的类
 */
public class FastFactory implements AbstractFactory {
    @Override
    public HtmlDocument createHtml(String md) {
        return new FastHtmlDocument(md);
    }

    @Override
    public WordDocument createWord(String md) {
        return new FastWordDocument(md);
    }
}
