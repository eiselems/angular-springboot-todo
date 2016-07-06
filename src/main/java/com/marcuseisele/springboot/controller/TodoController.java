package com.marcuseisele.springboot.controller;

import com.marcuseisele.springboot.model.Todo;
import com.marcuseisele.springboot.state.InMemoryState;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


/**
 * Created by marcuei on 05.07.2016.
 */
@RestController
@RequestMapping(value = "/api")
public class TodoController {

    @RequestMapping(value = "/todos", method = RequestMethod.GET)
    public Collection<Todo> getTodos(){
        return InMemoryState.getInstance().getTodos();
    }

    @RequestMapping(value = "/todos", method = RequestMethod.POST)
    public Todo createTodo(@RequestBody Todo newTodo){
        return InMemoryState.getInstance().addNewTodo(newTodo);
    }

    @RequestMapping(value = "/todos/{todoId}", method = RequestMethod.GET)
    public Todo getTodo(@PathVariable("todoId") long id){
        return InMemoryState.getInstance().getTodo(id);
    }

    @RequestMapping(value = "/todos/{todoId}", method = RequestMethod.DELETE)
    public Todo deleteTodo(@PathVariable("todoId") long id){
        return InMemoryState.getInstance().removeTodo(id);
    }

    @RequestMapping(value = "/todos/{todoId}", method = RequestMethod.PUT)
    public Todo updateTodo(@PathVariable("todoId") long id, @RequestBody Todo update){
        return InMemoryState.getInstance().updateTodo(id, update);
    }

}
