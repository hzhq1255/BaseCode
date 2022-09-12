package org.exmpale.base.AbstractAndInterface.AbstractClassExample1;


import org.exmpale.base.Util.myjson.JsonUtil;

/**
 * @author hzhq1255
 * @date 2022/2/2 20:23
 * 圆 继承几何抽象类
 *
 */
public class Circle extends GeometricObject {

    /**
     * 半径
     */
    private double radius;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (4.0 / 3.0 ) * Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return JsonUtil.toJsonString(this);
    }

}
