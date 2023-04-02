package work.hzhq1255.designPattern.creation.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/2 下午10:12
 */
class StudentTest {



    @Test
    void cloneStudent(){
        var stu = new Student(1, "zhangsan", 23);
        var actual = stu.clone();
        var expected = new Student(1, "zhangsan", 23);
        assertEquals(expected, actual);
    }

    @Test
    void copyStudent(){
        var stu = new Student(1, "zhangsan", 23);
        var actual = stu.copy();
        var expected = new Student(1, "zhangsan", 23);
        assertEquals(expected, actual);
    }

}
