package com.icaro.app.visit;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;

import com.icaro.app.model.BaseEntity;

/**

 */
public interface VisitRepository extends Repository<Visit, Integer> {

    /**
     * Save a <code>Visit</code> to the data store, either inserting or updating it.
     *
     * @param visit the <code>Visit</code> to save
     * @see BaseEntity#isNew
     */
    void save(Visit visit) throws DataAccessException;

    List<Visit> findByPetId(Integer petId);

}
