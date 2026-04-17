package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    public static boolean demonstrateLengthComparison(Length l1, Length l2) {
        boolean result = l1.equals(l2);
        System.out.println("Result: " + result);
        return result;
    }

    public static void main(String[] args) {
        // Yard to Feet Comparison (1 yard = 3 feet)
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);
        Length feet = new Length(3.0, Length.LengthUnit.FEET);
        System.out.println("Input: 1.0 yd and 3.0 ft");
        demonstrateLengthComparison(yard, feet);

        // CM to Inches Comparison (1 cm = 0.393701 in)
        Length cm = new Length(1.0, Length.LengthUnit.CENTIMETERS);
        Length inches = new Length(0.393701, Length.LengthUnit.INCHES);
        System.out.println("Input: 1.0 cm and 0.393701 in");
        demonstrateLengthComparison(cm, inches);
    }
}