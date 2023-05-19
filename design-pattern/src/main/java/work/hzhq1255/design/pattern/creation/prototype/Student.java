package work.hzhq1255.design.pattern.creation.prototype;

import java.util.Objects;

/**
 * @author hzhq
 * @version 1.0
 * @since 2023/4/2 下午9:32
 */
public class Student implements Cloneable {

    private int id;
    private String name;
    private int age;


    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student student) {
            if (student.id != this.id)
                return false;
            if (student.age != this.age)
                return false;
            return Objects.equals(student.name, this.name);
        } else {
            throw new RuntimeException("un supported class" + obj.getClass());
        }
    }

    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            clone.id = id;
            clone.name = name;
            clone.age = age;
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException("not supported clone");
        }
    }


    public Student copy() {
        return new Student(this.id, this.name, this.age);
    }
}
