package org.exmpale.base.AbstractAndInterface.AbstractClassExample;

/**
 * @author hzhq1255
 * @date 2022/2/2 20:51
 */
public class TestGeometricObject {

    public static void main(String[] args) {
        // 创建两个几何对象
        GeometricObject object1 = new Circle(5);
        GeometricObject object2 = new Rectangle(5,3);

        System.out.println(equalArea(object1,object2));

        displayGeometricObject(object1);

        displayGeometricObject(object2);
    }


    public static boolean equalArea(GeometricObject o1, GeometricObject o2){
        return o1.getArea() == o2.getArea();
    }

    public static void displayGeometricObject(GeometricObject object){
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}
