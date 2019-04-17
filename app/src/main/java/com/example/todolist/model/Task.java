package com.example.todolist.model;

public class Task {

    private String name;
    private boolean completed;

    /**
     * This builds a new Task object in memory using a given "name" parameter and defaults the
     * completed flag to false, because all new tasks are initially incomplete.
     * @param name The name of the task to complete or to-do
     */
    public Task(String name) {
        this.name = name;
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
