package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    public static void demonstrateFeetInchesComparison() {
        Length feet = new Length(1.0, Length.LengthUnit.FEET);
        Length inches = new Length(12.0, Length.LengthUnit.INCHES);
        System.out.println("Input: 1.0 feet and 12.0 inches");
        System.out.println("Output: Equal (" + feet.equals(inches) + ")");
    }

    public static void main(String[] args) {
        demonstrateFeetInchesComparison();
    }
}