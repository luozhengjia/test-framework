package cn.uc.itest.model;

import java.io.Serializable;

public class Application implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private int count;

    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
