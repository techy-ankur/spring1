package com.ankur.learning;

/**
 * @author ankurpratik on 23/10/18.
 */
public class Triangle implements Shape {

    //we can set this message via spring properties.
    private String message;

    public Triangle(String message) {
        this.message = message;
    }

    public Triangle() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void onDraw() {
        System.out.println(message);
    }

    public void init(){
        System.out.println("Triangle will be created");
    }

    public void cleanUp(){
        System.out.println("Triangle is destroyed");
    }
}
