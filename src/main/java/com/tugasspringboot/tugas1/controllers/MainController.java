/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugasspringboot.tugas1.controllers;

import com.tugasspringboot.tugas1.interfaces.InvenInterface;
import com.tugasspringboot.tugas1.models.Inven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author macbook
 */
@Controller
public class MainController {

    @Autowired
    private InvenInterface invenInterface;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("list", invenInterface.getAll());
        return "index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        
        Inven inven = new Inven();
        model.addAttribute("todo", inven);
        
        return "create";
    }

    @PostMapping("/store")
    public String store(@ModelAttribute("inven") Inven inven) {
        invenInterface.store(inven);
        return "redirect:/";
    }
}