package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.apps.quantitymeasurement.Length.LengthUnit;

public class QuantityMeasurementAppTest {

    @Test
    public void testFeetInchesComparison() {
        Length feet = new Length(1.0, LengthUnit.FEET);
        Length inches = new Length(12.0, LengthUnit.INCHES);
        // UC3 core requirement: 1 ft should equal 12 inches [cite: 103]
        assertEquals(feet, inches);
    }

    @Test
    public void testInchesToFeetSymmetry() {
        Length inches = new Length(12.0, LengthUnit.INCHES);
        Length feet = new Length(1.0, LengthUnit.FEET);
        assertEquals(inches, feet); // Symmetry test [cite: 107]
    }

    @Test
    public void testSameUnitEquality() {
        assertEquals(new Length(1.0, LengthUnit.FEET), new Length(1.0, LengthUnit.FEET));
        assertEquals(new Length(1.0, LengthUnit.INCHES), new Length(1.0, LengthUnit.INCHES));
    }

    @Test
    public void testInequality() {
        assertNotEquals(new Length(1.0, LengthUnit.FEET), new Length(2.0, LengthUnit.FEET));
        assertNotEquals(new Length(1.0, LengthUnit.FEET), new Length(1.0, LengthUnit.INCHES));
    }

    @Test
    public void testNullAndTypeSafety() {
        Length feet = new Length(1.0, LengthUnit.FEET);
        assertNotEquals(null, feet); // Null handling [cite: 66]
        assertNotEquals(feet, new Object()); // Type safety [cite: 68]
    }
}
