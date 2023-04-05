package work.hzhq1255.designPattern.structural.decorator;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/6 上午12:34
 */
public class BoldDecorator extends NodeDecorator {

    public BoldDecorator(TextNode target) {
        super(target);
    }

    @Override
    public String getText() {
        return "<b>" + target.getText() + "</b>";
    }
}
