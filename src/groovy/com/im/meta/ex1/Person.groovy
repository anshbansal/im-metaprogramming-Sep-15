package com.im.meta.ex1

class MyPerson {
    String name
}


class MyPersonWrap {
    static MyPerson getMyPerson() {
        new MyPerson()
    }

    static MyPerson getOriginalPerson() {
        new MyPerson()
    }

    static void modifyPerson() {

    }

    static void addStaticMethod() {

    }

    static void addConstructor() {

    }
}
