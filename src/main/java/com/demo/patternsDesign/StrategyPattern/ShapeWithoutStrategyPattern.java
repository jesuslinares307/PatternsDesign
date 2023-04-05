package com.demo.patternsDesign.StrategyPattern;

public class ShapeWithoutStrategyPattern {
    private String type;

    public ShapeWithoutStrategyPattern (String type){
        this.type = type;
    }

    public void draw(){
        if (type.equals("circle")){
            drawCircle();
        } else if (type.equals("square")){
            drawSquare();
        } else if (type.equals("triangle")) {
            drawTriangle();
        }
    }

    private void drawCircle(){
        //code to draw a circle
    }

    private void drawSquare(){
        //code to draw a square
    }

    private void drawTriangle(){
        //code to draw a trinagle
    }
}
