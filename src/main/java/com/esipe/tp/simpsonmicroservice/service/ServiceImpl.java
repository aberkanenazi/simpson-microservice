package com.esipe.tp.simpsonmicroservice.service;

import java.util.List;
import java.util.Optional;

public interface ServiceImpl<E> {
    E create(E e);
    Optional<E> findById(long id);
    List<E> findAll();
    void deleteById(long id);


}
