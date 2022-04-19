package org.exmpale.base.AbstractAndInterface.AbstractClassExample1;

import org.exmpale.base.Util.myjson.JsonUtil;

import java.util.Date;

/**
 * @author hzhq1255
 * @date 2022/2/2 20:08
 * 抽象类练习
 * 几何抽象父类对象
 *
 */
public abstract class GeometricObject {

    /**
     * 几何对象共有的颜色
     */
    private String color = "white";

    /**
     * 是否实心
     */
    private boolean filled;

    /**
     * 对象创建日期
     */
    private Date dateCreated;


    /**
     * 共有方法获取 几何对象的面积
     *
     * @return 面积
     */
    public abstract double getArea();

    /**
     * 共有方法获取 几何对象的周长
     * @return 周长
     */
    public abstract double getPerimeter();


    /** get 和 set 方法 */
    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public Date getDateCreated(){
        return this.dateCreated;
    }

    public void setDateCreated(Date dateCreated){
        this.dateCreated = dateCreated;
    }

    /** 构造器 */
    protected GeometricObject(){
        this.dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    /** toString */
    @Override
    public String toString(){
        return JsonUtil.toJsonString(this);
    }

}
