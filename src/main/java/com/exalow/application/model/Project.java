package com.exalow.application.model;

import com.exalow.application.util.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Project {

    private String name;
    private String location;
    private List<Class> classes = new ArrayList<>();


    public Project(String name, String path) {
        this.name = name;
        this.location = path;
    }

    public static Project loadFromDirectory(String location) {
        return (Project) FileUtils.deserialize(FileUtils.loadContent(new File(location)), Project.class);
    }

    public static Project createAs(String name, String location) {
        FileUtils.saveContent(new File(location), FileUtils.serialize(new Project(name, location)));
        return new Project(name, location);
    }

    public void save() {
        FileUtils.saveContent(new File(location), FileUtils.serialize(this));
    }

    public void addClass(Class c) {
        classes.add(c);
        save();
    }

    public void removeClass(Class c) {
        classes.remove(c);
        save();
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return location;
    }

    public List<Class> getClasses() {
        return classes;
    }
}
