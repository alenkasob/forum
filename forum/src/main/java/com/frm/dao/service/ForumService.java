package com.frm.dao.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.util.Collection;
import java.util.List;


public interface ForumService<E> {

    E save(E entity);

    void saveAll(Collection<E> entities);

    E findById(String id);

    List<E> findByIdIn(Collection<String> ids);

    Page<E> findPage(Pageable pageable);

    Page<E> findSpec(Specification<E> spec, Pageable pageable);

    List<E> findAll(Sort sort);

    void deleteById(String id);

    void deleteByIdIn(Collection<String> ids);

    void delete(E entity);
}
