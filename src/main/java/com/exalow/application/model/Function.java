package com.exalow.application.model;

import com.exalow.application.model.key.AccessModifier;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Function {

    private AccessModifier access;
    private String type;
    private String name;
    private Field[] parameters;

    private Function(Builder builder) {
        this.access = builder.access;
        this.type = builder.type;
        this.name = builder.name;
        this.parameters = builder.parameters;
    }

    public static class Builder {

        private AccessModifier access;
        private String type;
        private String name;
        private Field[] parameters;

        public Builder access(AccessModifier modifier) {
            this.access = modifier;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder parameters(Field[] fields) {
            this.parameters = fields;
            return this;
        }

        public Function build() {
            return new Function(this);
        }
    }

    public AccessModifier getAccess() {
        return access;
    }

    public void setAccess(AccessModifier modifier) {
        this.access = modifier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Field[] getParameters() {
        return parameters;
    }

    public void setParameters(Field[] parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {

        StringJoiner joiner = new StringJoiner(" ");
        joiner.add(access.toString());
        joiner.add(type);
        joiner.add(name + "(" + Arrays.stream(parameters).map(Field::toString).collect(Collectors.joining("")) + ")");

        return joiner.toString();
    }

}
