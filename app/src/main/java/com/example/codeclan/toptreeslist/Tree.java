package com.example.codeclan.toptreeslist;

import java.io.Serializable;

/**
 * Created by fraserblack on 19/12/2017.
 */

public class Tree implements Serializable {

    private Integer ranking;
    private String name;
    private Integer age;

    public Tree(Integer ranking, String name, Integer age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return name;
    }

    public Integer getYear() {
        return age;
    }
}