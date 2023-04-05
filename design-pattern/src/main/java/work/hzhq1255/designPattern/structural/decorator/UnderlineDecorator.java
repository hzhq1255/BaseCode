package work.hzhq1255.designPattern.structural.decorator;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/6 上午12:38
 */
public class UnderlineDecorator extends NodeDecorator {
    public UnderlineDecorator(TextNode target) {
        super(target);
    }

    @Override
    public String getText() {
        return "<u>" + target.getText() + "</u>";
    }
}
