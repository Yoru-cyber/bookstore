package com.carlos.bookstore.in;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
//Make generic RestUI 
public interface GenericRestUI<T> {
    @PostMapping
    public void createEntity(@RequestBody T entity);
    @GetMapping()
    public T getEntity(@PathVariable int id);
    @GetMapping
    public List<T> listEntity();
    @PostMapping
    public void deleteEntity(@PathVariable Long id);
}
