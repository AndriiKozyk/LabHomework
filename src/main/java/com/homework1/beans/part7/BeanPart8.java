package com.homework1.beans.part7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanPart8 {

    private Animal bird;
    private Animal cat;
    private Animal cow;
    private Animal dog;

    public Animal getBird() {
        return bird;
    }

    @Autowired
    public void setBird(Animal bird) {
        this.bird = bird;
    }

    public Animal getCat() {
        return cat;
    }

    @Autowired
    @Qualifier("cat")
    public void setCat(Animal cat) {
        this.cat = cat;
    }

    public Animal getCow() {
        return cow;
    }

    @Autowired
    @Qualifier("cow")
    public void setCow(Animal cow) {
        this.cow = cow;
    }

    public Animal getDog() {
        return dog;
    }

    @Autowired
    @Qualifier("dog")
    public void setDog(Animal dog) {
        this.dog = dog;
    }

}
