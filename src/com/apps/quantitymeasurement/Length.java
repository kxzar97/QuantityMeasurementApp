package com.apps.quantitymeasurement;

public class Length {
    private final double value;
    private final LengthUnit unit;

    public enum LengthUnit {
        // Conversion factors relative to Inches
        FEET(12.0),
        INCHES(1.0),
        YARDS(36.0),        // 1 yard = 3 feet = 36 inches
        CENTIMETERS(0.393701); // 1 cm = 0.393701 inches

        private final double conversionFactor;

        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }
    }

    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    private double convertToBaseUnit() {
        return value * unit.getConversionFactor();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Length that = (Length) obj;
        // Use Math.abs for small delta comparison due to double precision
        return Math.abs(this.convertToBaseUnit() - that.convertToBaseUnit()) < 0.0001;
    }
}