package com.exalow.application.model;

import com.exalow.application.model.key.ClassType;

import java.util.ArrayList;
import java.util.List;

public class Class {

    private String name;
    private ClassType type;
    private String description;
    private List<Field> fields = new ArrayList<>();
    private List<Function> functions = new ArrayList<>();

    public Class(String name ,ClassType type, String description) {
        this.name = name;
        this.type = type;
        this.description = description;
    }

    public void addField(Field field) {
        fields.add(field);
    }

    public void removeField(Field field) {
        fields.remove(field);
    }

    public void addFunction(Function function) {
        functions.add(function);
    }

    public void removeFunction(Function function) {
        functions.remove(function);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassType getType() {
        return type;
    }

    public void setType(ClassType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Field> getFields() {
        return fields;
    }

    public List<Function> getFunctions() {
        return functions;
    }
}
