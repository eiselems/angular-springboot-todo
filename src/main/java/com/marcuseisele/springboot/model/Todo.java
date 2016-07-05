package com.marcuseisele.springboot.model;

/**
 * Created by marcuei on 05.07.2016.
 */
public class Todo {

    private final long id;
    private String text;
    private boolean done;

    public Todo(long id, String text) {
        this.id = id;
        this.text = text;
        this.done = false;
    }

    public long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Todo todo = (Todo) o;

        return id == todo.id;

    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
