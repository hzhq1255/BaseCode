package work.hzhq1255.designPattern.structural.decorator;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/6 上午12:31
 */
public abstract class NodeDecorator implements TextNode {

    protected final TextNode target;

    public NodeDecorator(TextNode target) {
        this.target = target;
    }

    public void setText(String text) {
        this.target.setText(text);
    }

}
