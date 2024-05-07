package com.carlos.bookstore.example.services;

import java.util.List;

public interface GenericService<T> {
    void createEntity(T entity);
    T getEntity(Long id);
    void editEntity(Long id, T entity);
    void deleteEntity(Long id);
    List<T> listEntity();
}
