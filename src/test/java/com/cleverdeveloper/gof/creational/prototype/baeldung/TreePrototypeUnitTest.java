package com.cleverdeveloper.gof.creational.prototype.baeldung;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.*;


/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/12/2022 12:06 AM
*/

class TreePrototypeUnitTest {

    double mass;
    double height;
    Position positionOne;
    Position positionTwo;

    @BeforeEach
    void setUp() {
        double mass = 10.0;
        double height = 3.7;
        positionOne = new Position(3, 7);
        positionTwo = new Position(4, 8);
    }

    @Test
    public void given_a_PlasticTreePrototype_when_cloned_then_create_a_clone() {
        Tree plasticTreeOne = new PlasticTree(mass, height);
        plasticTreeOne.setPosition(positionOne);

        Tree plasticTreeTwo = plasticTreeOne.copy();
        plasticTreeTwo.setPosition(positionTwo);

        assertEquals(positionOne, plasticTreeOne.getPosition());
        assertEquals(positionTwo, plasticTreeTwo.getPosition());
    }

    @Test
    void given_a_PineTreePrototype_when_cloned_then_create_a_clone() {
        Tree pineTreeOne = new PineTree(mass, height);
        pineTreeOne.setPosition(positionOne);

        Tree pineTreeTwo = pineTreeOne.copy();
        pineTreeTwo.setPosition(positionTwo);

        assertEquals(positionOne, pineTreeOne.getPosition());
        assertEquals(positionTwo, pineTreeTwo.getPosition());
    }

    @Test
    void given_a_list_of_trees_when_cloned_then_create_list_of_clones() {

        PlasticTree plasticTree = new PlasticTree(mass, height);
        plasticTree.setPosition(positionOne);

        PineTree pineTree = new PineTree(mass, height);
        pineTree.setPosition(positionTwo);

        List<Tree> trees = Arrays.asList(plasticTree, pineTree);

        List<Tree> treeClones = trees.stream().map(Tree::copy).collect(toList());

        Tree plasticTreeClone = treeClones.get(0);

        assertEquals(mass, plasticTreeClone.getMass());
        assertEquals(height, plasticTreeClone.getHeight());
        assertEquals(positionOne, plasticTree.getPosition());
    }
}