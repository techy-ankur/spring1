package com.ankur.learning;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author ankurpratik on 23/10/18.
 */
public class Rectangle implements Shape, InitializingBean, DisposableBean , ApplicationContextAware , BeanNameAware{

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Point getPointD() {
        return pointD;
    }

    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }

    @Override
    public void onDraw() {
        System.out.println("Rectangle onDraw "+pointA.toString() + pointB.toString()+ pointC.toString()+ pointD.toString());
    }

    //called before bean is destoryed
    @Override
    public void destroy() throws Exception {
        System.out.println("Bean is destroyed");
    }

    //called before bean initialization
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean is initialized");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("here context is available");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name "+s);
    }
}
