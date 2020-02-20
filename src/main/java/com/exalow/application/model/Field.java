package com.exalow.application.model;

import com.exalow.application.model.key.AccessModifier;

public class Field {

    private AccessModifier access;
    private String type;
    private String name;

    public Field(AccessModifier modifier, String type, String name) {
        this.access = modifier;
        this.type = type;
        this.name = name;
    }

    public Field(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public AccessModifier getAccessModifier() {
        return access;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (access == null) {
            return type + " " + name;
        }
        return access + " " + type + " " + name;
    }
}
