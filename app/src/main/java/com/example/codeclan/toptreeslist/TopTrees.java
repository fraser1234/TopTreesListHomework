package com.example.codeclan.toptreeslist;

import java.util.ArrayList;

/**
 * Created by fraserblack on 19/12/2017.
 */

public class TopTrees {
    private ArrayList<Tree> list;

    public TopTrees() {
        list = new ArrayList<Tree>();
        list.add(new Tree(1, "pine", 1994));
        list.add(new Tree(2, "oak", 1972));
        list.add(new Tree(3, "sycamore", 1974));
        list.add(new Tree(4, "rose", 2008));
        list.add(new Tree(5, "daisy", 1957));
        list.add(new Tree(6, "big", 1993));
        list.add(new Tree(7, "small", 1994));
        list.add(new Tree(8, "spikey", 2003));
        list.add(new Tree(9, "green", 1966));
        list.add(new Tree(10, "red", 1999));
        list.add(new Tree(11, "blue", 2001));

    }

    public ArrayList<Tree> getList() {
        return new ArrayList<Tree>(list);
    }

}
