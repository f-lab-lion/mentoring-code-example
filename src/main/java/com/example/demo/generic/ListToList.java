package com.example.demo.generic;

import java.util.List;

public class ListToList {

    void listToList(List<? extends Number> from, List<? super Number> to) {
        for (int i = 0; i < from.size(); i++) {
            Number number = from.get(0);
            to.add(number);
        }
    }
}
