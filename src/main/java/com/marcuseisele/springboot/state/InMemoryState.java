package com.marcuseisele.springboot.state;

import com.marcuseisele.springboot.exceptions.TodoNotFoundException;
import com.marcuseisele.springboot.model.Todo;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created by marcuei on 05.07.2016.
 */
public class InMemoryState {

    private static InMemoryState instance;

    private long latestId = 0L;

    private HashMap<Long, Todo> todos;

    private InMemoryState() {
        this.todos = new HashMap<>();
    }

    public static InMemoryState getInstance() {
        if (instance == null) {
            instance = new InMemoryState();
        }
        return instance;
    }

    public Collection<Todo> getTodos() {
        return todos.values();
    }

    public Todo addNewTodo(Todo newTodo) {
        newTodo.setId(++latestId);
        todos.put(latestId, newTodo);
        return newTodo;
    }

    public Todo removeTodo(long id) {
        if (!todos.containsKey(id)) {
            throw new TodoNotFoundException(id);
        }
        return todos.remove(id);

    }

    public Todo getTodo(long id) {
        if (!todos.containsKey(id)) {
            throw new TodoNotFoundException(id);
        }

        return todos.get(id);

    }

    public Todo updateTodo(long id, Todo update) {
        if (!todos.containsKey(id)) {
            throw new TodoNotFoundException(id);
        }
        //TODO: add better handling of differences between id in path and id in update
        //        if(id != update.getId()){
        //            throw new whateverException;
        //        }
        todos.put(id, update);
        return update;
    }
}
