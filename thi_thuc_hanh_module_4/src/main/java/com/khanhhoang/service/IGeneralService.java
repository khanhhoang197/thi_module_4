package com.khanhhoang.service;

import java.util.Optional;

public interface IGeneralService <T>{
    Optional<T> findById(Long id);

    T save(T t);

}