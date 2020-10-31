package com.yang.jvm;

import java.util.ArrayList;

public class ch2 {

    static class OOMObject {

    }

    public static void main(String[] args) {
        ArrayList<OOMObject> objects = new ArrayList<>();
        while (true) {
            objects.add(new OOMObject());
        }
    }

}
