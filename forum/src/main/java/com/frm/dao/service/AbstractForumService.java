package com.frm.dao.service;

import com.frm.dao.repository.ForumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.util.Collection;
import java.util.List;

public abstract class AbstractForumService<E, R extends ForumRepository<E>>
        implements ForumService<E> {

    @Autowired protected R repository;

    @Override
    public E save(E entity) {
        return repository.save(entity);
    }

    @Override
    public void saveAll(Collection<E> entities) {
        repository.saveAll(entities);
    }

    @Override
    public E findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<E> findByIdIn(Collection<String> ids) {
        return repository.findByIdIn(ids);
    }

    @Override
    public Page<E> findPage(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Page<E> findSpec(Specification<E> spec, Pageable pageable) {
        return repository.findAll(spec, pageable);
    }

    @Override
    public List<E> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteByIdIn(Collection<String> ids) {
        repository.deleteByIdIn(ids);
    }

    @Override
    public void delete(E entity) {
        repository.delete(entity);
    }

}