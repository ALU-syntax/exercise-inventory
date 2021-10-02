/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugasspringboot.tugas1.services;

import com.tugasspringboot.tugas1.interfaces.InvenInterface;
import com.tugasspringboot.tugas1.models.Inven;
import com.tugasspringboot.tugas1.repositories.InvenRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author macbook
 */
@Service
public class InvenService implements InvenInterface{
    
    @Autowired
    private InvenRepository invenRepository;

    @Override
    public List<Inven> getAll() {
        return invenRepository.findAll();
    }

    @Override
    public void store(Inven inven) {
        this.invenRepository.save(inven);
    }
    
    @Override
    public Inven getById(long id) {
        Optional < Inven > optional = invenRepository.findById(id);

        if (!optional.isPresent()) {
        throw new RuntimeException(" Item not found for id :: " + id);
    }

    Inven inven = optional.get();
        return inven;
    }

    @Override
    public void delete(long id) {
        this.invenRepository.deleteById(id);
    }    
    
    
}
