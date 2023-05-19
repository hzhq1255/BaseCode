package work.hzhq1255.design.pattern.structural.decorator;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/6 上午12:35
 */
public class ItalicDecorator extends NodeDecorator {
    public ItalicDecorator(TextNode target) {
        super(target);
    }

    @Override
    public String getText() {
        return "<i>" + target.getText() + "</i>";
    }
}
