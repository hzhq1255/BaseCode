package work.hzhq1255.designPattern.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/6 上午12:40
 */
class SpanNodeTest {


    @Test
    void getSpanText() {
        TextNode node = new SpanNode();
        node.setText("Hello");
        String actual = node.getText();
        String expected = "<span>Hello</span>";
        assertEquals(expected, actual);


    }


    @Test
    void getBoldUnderlineSpanText() {
        TextNode node = new BoldDecorator(new UnderlineDecorator(new SpanNode()));
        node.setText("Hello");
        String actual = node.getText();
        String expected = "<b><u><span>Hello</span></u></b>";
        assertEquals(expected, actual);
    }

    @Test
    void getItalicBoldSpanText() {
        TextNode node = new ItalicDecorator(new BoldDecorator(new SpanNode()));
        node.setText("Hello");
        String actual = node.getText();
        String expected = "<i><b><span>Hello</span></b></i>";
        assertEquals(expected, actual);

    }

    @Test
    void getDelSpanNode() {
        TextNode node = new DelDecorator(new BoldDecorator(new UnderlineDecorator(new ItalicDecorator(new SpanNode()))));
        node.setText("Hello");
        String actual = node.getText();
        String expected = "<del><b><u><i><span>Hello</span></i></u></b></del>";
        assertEquals(expected, actual);



    }


}
