/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ThymeLea01;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @author jesgo
 */
@Controller
@Slf4j
public class Inicioo {
    
    @GetMapping("/")
    public String MuestraString(Model model){
        var mensaje = "agregando un parrafo con Spring";
        log.info("ejecutandose controlador rest");
        log.debug("mas alla ");
        model.addAttribute("mensaje", mensaje);
        return("index");
        
    }
}
