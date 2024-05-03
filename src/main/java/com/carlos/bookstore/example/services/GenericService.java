package com.carlos.bookstore.example.services;

import java.util.List;

public interface GenericService<T> {
    void createEntity(T entity);
    T getEntity(Long id);
    T editEntity(Long id);
    void deleteEntity(Long id);
    List<T> listEntity();
}
