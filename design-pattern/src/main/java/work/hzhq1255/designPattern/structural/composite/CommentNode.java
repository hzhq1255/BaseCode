package work.hzhq1255.designPattern.structural.composite;

import java.util.List;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/3 上午12:20
 */
public class CommentNode implements Node {

    private String text;

    public CommentNode(String text) {
        this.text = text;
    }

    @Override
    public Node add(Node node) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Node> children() {
        return List.of();
    }

    @Override
    public String toXml() {
        return "<!--" + text + "-->";
    }
}
