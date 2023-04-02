package work.hzhq1255.designPattern.structural.composite;

import org.junit.jupiter.api.Test;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/3 上午12:29
 */
class NodeTest {


    @Test
    void buildXml(){
        Node root = new ElementNode("div");
        root.add(new ElementNode("h1")
                .add(new TextNode("Test"))
                .add(new TextNode("XML")));
        root.add(new ElementNode("p")
                .add(new TextNode("add"))
                .add(new TextNode("comment"))
                .add(new CommentNode("this is comment...")));
        System.out.println(root.toXml());
    }

}
