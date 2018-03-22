package com.parfait.study.simplemultitx.dual.controller;

import com.parfait.study.simplemultitx.dual.service.LogicService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final LogicService logicService;

    @Autowired
    public TestController(@NonNull LogicService logicService) {
        this.logicService = logicService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping("/required-required")
    public void required_required() {
        logicService.required_required();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping("/required-requires-new")
    public void required_requiresNew() {
        logicService.required_requiresNew();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping("/required-nested")
    public void required_nested() {
        logicService.required_nested();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping("/requires-new-required")
    public void requiresNew_required() {
        logicService.requiresNew_required();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping("/requires-new-requires-new")
    public void requires_new_requires_new() {
        logicService.requiresNew_requiresNew();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping("/requires-new-nested")
    public void requires_new_nested() {
        logicService.requiresNew_nested();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping("/nested-required")
    public void nested_required() {
        logicService.nested_required();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping("/nested-requires-new")
    public void requiredException() {
        logicService.nested_requiresNew();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping("/nested-nested")
    public void requiresNew() {
        logicService.nested_nested();
    }
}
