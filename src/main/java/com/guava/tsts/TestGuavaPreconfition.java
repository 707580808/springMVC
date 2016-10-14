package com.guava.tsts;

import com.google.common.base.Objects;

import static com.google.common.base.Preconditions.*;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * TestGuavaPreconfition
 * Author: zq
 * Date：2016/9/28
 */
public class TestGuavaPreconfition {
    private String label;
    private int[] values = new int[5];
    private int currentIndex;

    public static void main(String[] args) {
     String s= Objects.firstNonNull(null,"dsuihywiu");
        System.out.println(s);
       int a =Objects.hashCode("rthr");
        System.out.println(a);
    }


    public void PreconditionExample(String label) {
//returns value of object if not null
        this.label = checkNotNull(label, "Label can''t be null");
    }

    public void updateCurrentIndexValue(int index, int valueToSet) {
//Check index valid first
        this.currentIndex = checkElementIndex(index, values.length, "Index out of bounds for values");
//Validate valueToSet
        checkArgument(valueToSet <= 100, "Value can't be more than 100");
        values[this.currentIndex] = valueToSet;
    }

    public void doOperation() {
        checkState(validateObjectState(), "Can't perform operation");
    }

    private boolean validateObjectState() {
        return this.label.equalsIgnoreCase("open") && values[this.currentIndex] == 10;
    }
}