package com.frm.dao.repository;

/**
 * Created by User on 23.11.2018.
 */
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Collection;
import java.util.List;

@NoRepositoryBean
public interface ForumRepository<E> extends
        PagingAndSortingRepository<E, String>,
        JpaSpecificationExecutor<E> {

    List<E> findByIdIn(Collection<String> ids);

    List<E> findAll(Sort sort);

    void deleteById(String id);

    void deleteByIdIn(Collection<String> ids);

    void delete(E entity);

}