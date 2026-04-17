package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.apps.quantitymeasurement.Length.LengthUnit;

public class QuantityMeasurementAppTest {

    @Test
    public void testYardToFeetEquality() {
        Length yard = new Length(1.0, LengthUnit.YARDS);
        Length feet = new Length(3.0, LengthUnit.FEET);
        assertEquals(yard, feet); // 1 yard = 3 feet
    }

    @Test
    public void testYardToInchesEquality() {
        Length yard = new Length(1.0, LengthUnit.YARDS);
        Length inches = new Length(36.0, LengthUnit.INCHES);
        assertEquals(yard, inches); // 1 yard = 36 inches
    }

    @Test
    public void testCentimetersToInchesEquality() {
        Length cm = new Length(1.0, LengthUnit.CENTIMETERS);
        Length inches = new Length(0.393701, LengthUnit.INCHES);
        assertEquals(cm, inches); // 1 cm = 0.393701 in
    }

    @Test
    public void testSymmetryAcrossUnits() {
        Length feet = new Length(3.0, LengthUnit.FEET);
        Length yard = new Length(1.0, LengthUnit.YARDS);
        assertEquals(feet, yard); // Symmetry: feet to yard
    }

    @Test
    public void testTransitiveProperty() {
        Length yard = new Length(1.0, LengthUnit.YARDS);
        Length feet = new Length(3.0, LengthUnit.FEET);
        Length inches = new Length(36.0, LengthUnit.INCHES);

        // If A=B and B=C, then A=C
        assertEquals(yard, feet);
        assertEquals(feet, inches);
        assertEquals(yard, inches);
    }

    @Test
    public void testInequality() {
        assertNotEquals(new Length(1.0, LengthUnit.YARDS), new Length(2.0, LengthUnit.FEET));
        assertNotEquals(new Length(1.0, LengthUnit.CENTIMETERS), new Length(1.0, LengthUnit.FEET));
    }
}
