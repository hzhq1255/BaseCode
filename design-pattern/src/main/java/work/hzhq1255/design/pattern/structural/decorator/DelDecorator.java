package work.hzhq1255.design.pattern.structural.decorator;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/6 上午12:39
 */
public class DelDecorator extends NodeDecorator {
    public DelDecorator(TextNode target) {
        super(target);
    }

    @Override
    public String getText() {
        return "<del>" + target.getText() + "</del>";
    }
}
