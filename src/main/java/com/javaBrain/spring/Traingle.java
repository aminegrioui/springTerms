package com.javaBrain.spring;

public class Traingle {
 String type;
 int height;

  public Traingle(String type){
      this.type=type;
  }

  public Traingle(String type, int height){
      this.type=type;
      this.height=height;
  }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void draw(){
        System.out.println(type + " draw a traingle " + height);
    }
}
