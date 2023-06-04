package com.example.demos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SampleDemo {

    private int aid;
    private String name;
    private String tech;
    @Autowired
    private Laptop laptop;
    public SampleDemo() {
        super();
        System.out.println("object created..");
    }
    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public String getName() {
        return name;
    }
    public void setName(String aname) {
        this.name = aname;
    }
    public String getTech() {
        return tech;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }
    public Laptop getLaptop() {
        return laptop;
    }
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
    public void show()
    {
        System.out.println("in show");
        laptop.compile();
    }
}

