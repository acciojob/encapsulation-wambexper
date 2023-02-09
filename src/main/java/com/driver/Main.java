package com.driver;

public class Main {
    public static void main(String[] args){
        RWOnly obj = new RWOnly();
        obj.setName("peter");
        //create methode "RWOnly" as an error appears.
        System.out.println(obj.getName());
    }

}
