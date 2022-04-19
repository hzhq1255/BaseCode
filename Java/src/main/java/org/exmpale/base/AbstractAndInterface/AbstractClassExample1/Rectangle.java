package org.exmpale.base.AbstractAndInterface.AbstractClassExample;


import org.exmpale.base.Util.myjson.JsonUtil;

/**
 * @author hzhq1255
 * @date 2022/2/2 20:23
 * 矩形继承 抽象类 几何对象
 *
 * 共有类被重写
 */
public class Rectangle extends GeometricObject {

    /**
     * 宽
     */
    private double width;

    /**
     * 高
     */
    private double height;

    /** get and set */
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    /**
     * 面积
     * @return 长 * 宽
     */
    @Override
    public double getArea() {
        return width * height;
    }

    /**
     * 周长
     * @return 2 * (长 + 宽)
     */
    @Override
    public double getPerimeter() {
        return 2 * ( width + height);
    }


    @Override
    public String toString(){
        return JsonUtil.toJsonString(this);
    }
}
