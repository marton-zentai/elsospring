package com.example.elsospring.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionGeneral {

    //minden kontrollerben egyszerre kezeli a kiveteleket
    @ExceptionHandler
    public String exceptionHandler(Exception ex, Model model) {
        model.addAttribute("exception", ex);
        return "whateverHandlesTheException";
    }

}
