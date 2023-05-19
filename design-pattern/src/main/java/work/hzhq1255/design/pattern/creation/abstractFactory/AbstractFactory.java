package work.hzhq1255.design.pattern.creation.abstractFactory;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/2 上午1:58
 * 抽象工厂
 * Markdown 转 html 和 word 服务
 */
public interface AbstractFactory {
    // create html
    HtmlDocument createHtml(String md);

    // create word
    WordDocument createWord(String md);

    static AbstractFactory createFactory(String name) {
        if (name.equalsIgnoreCase("fast")) {
            return new FastFactory();
        } else if (name.equalsIgnoreCase("good")) {
            return new GoodFactory();
        } else {
            throw new IllegalArgumentException("Invalid factory name");
        }
    }
}
