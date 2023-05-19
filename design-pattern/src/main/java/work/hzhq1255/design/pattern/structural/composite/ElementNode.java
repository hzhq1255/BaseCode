package work.hzhq1255.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/3 上午12:19
 */
public class ElementNode implements Node{

    private String name;

    private List<Node> list = new ArrayList<>();

    public ElementNode(String name) {
        this.name = name;
    }

    @Override
    public Node add(Node node) {
        list.add(node);
        return this;
    }

    @Override
    public List<Node> children() {
        return list;
    }

    @Override
    public String toXml() {
        String prefix = "<" + name + ">\n";
        String suffix = "</" + name + ">\n";
        StringJoiner sj = new StringJoiner("", prefix, suffix);
        list.forEach(node -> {
            sj.add(node.toXml() + "\n");
        });
        return sj.toString();
    }
}
