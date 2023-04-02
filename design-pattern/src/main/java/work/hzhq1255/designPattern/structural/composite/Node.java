package work.hzhq1255.designPattern.structural.composite;

import java.util.List;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/3 上午12:17
 * xml html node
 */
public interface Node {
    // add a node as a child node
    Node add(Node node);

    // get children node
    List<Node> children();

    // output to xml
    String toXml();

}
