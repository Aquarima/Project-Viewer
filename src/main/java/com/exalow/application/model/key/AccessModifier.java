package com.exalow.application.model.key;

import javafx.scene.paint.Color;

public enum AccessModifier {

    PUBLIC('+', Color.LIGHTGREEN),
    PRIVATE('+', Color.RED),
    PROTECTED('+', Color.ORANGE);

    private char symbol;
    private Color color;

    AccessModifier(char symbol, Color color) {
        this.symbol = symbol;
        this.color = color;
    }

    public char getSymbol() {
        return symbol;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
