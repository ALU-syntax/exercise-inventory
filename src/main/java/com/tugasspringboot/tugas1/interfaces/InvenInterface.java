/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugasspringboot.tugas1.interfaces;

import java.util.List;

/**
 *
 * @author macbook
 */
public interface InvenInterface {
 List<Inven> getAll();
    void store(Inven inven);
    Inven getById(long id);
    void delete(long id);   
}
