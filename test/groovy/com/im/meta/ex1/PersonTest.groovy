package com.im.meta.ex1

import spock.lang.Specification
import spock.lang.Stepwise

@Stepwise
class PersonTest extends Specification {

    def "test that a hello() method can be added a MyPerson object which returns 'hello' "() {

    expect:
        MyPersonWrap.myPerson.hello() == "hello"
    }

    def "test that the MyPerson class does not have a new method hello() till now"() {

    when:
        MyPersonWrap.originalPerson.hello()

    then:
        thrown(MissingMethodException)
    }

    def "test that if a method is added to the class then all objects created after that have a new method"() {

    when:
        MyPersonWrap.modifyPerson()

    then:
        MyPersonWrap.myPerson.hello2() == "hello2"
        MyPersonWrap.originalPerson.hello2() == "hello2"
    }

    def "test that static method staticHello was added to the MyPerson class"() {

    when:
        MyPersonWrap.addStaticMethod()

    then:
        MyPerson.staticHello() == "staticHello"
    }

    def "test that a new constructor is present"() {

    when:
        MyPersonWrap.addConstructor()

    then:
        new MyPerson("groovy").name == "groovy"
    }

}