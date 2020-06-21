package com.ranjit.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionAndBiFunction {

    private Double volumeOfCube(Double side) {
        return Math.pow(side, 3);
    }

    private Double volumeOfCylinder(Double radius, Double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    private Double findRadius(Double diameter) {
        return diameter / 2;
    }

    private Double areaOfCircle(Double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public void withFunctional() {
        //Function
        Function<Double, Double> volumeOfCube = side -> Math.pow(side, 3);
        System.out.println("Volume of cube without functional :" + volumeOfCube(4D));
        System.out.println("Volume of cube with functional :" + volumeOfCube.apply(4D));

        //BiFunction
        BiFunction<Double, Double, Double> volumeOfCylinder = (radius, height) -> Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of Cylinder without functional: " + volumeOfCylinder(100D, 20D));
        System.out.println("Volume of Cylinder with functional: " + volumeOfCylinder.apply(100D, 20D));

        //chaining, output of one function is to input of another function.
        Function<Double, Double> findRadius = diameter -> diameter / 2;
        Function<Double, Double> areaOfCircle = radius -> Math.PI * Math.pow(radius, 2);
        System.out.println("without functional " + areaOfCircle(findRadius(20D)));
        System.out.println("with functional " + findRadius.andThen(areaOfCircle).apply(20D));
    }

}
