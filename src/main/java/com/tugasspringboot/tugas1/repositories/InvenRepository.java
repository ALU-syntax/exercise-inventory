/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugasspringboot.tugas1.repositories;

import com.tugasspringboot.tugas1.models.Inven;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author macbook
 */
@Repository
public interface InvenRepository extends JpaRepository<Inven, Long>{
    
}