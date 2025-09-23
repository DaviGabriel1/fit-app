package com.davi.fitapp.tracking.infrastructure.adapters;

public interface StorageAdapter<T> {
    void putObject(T object);

    T getObject();
}
