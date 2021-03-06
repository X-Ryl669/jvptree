package com.eatthepath.jvptree;

import com.eatthepath.jvptree.DistanceFunction;

public class IntegerDistanceFunction implements DistanceFunction<Number> {

    public double getDistance(final Number firstPoint, final Number secondPoint) {
        return Math.abs(firstPoint.intValue() - secondPoint.intValue());
    }
}
