package com.pattsui.controller;

import com.pattsui.model.Beach;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/nada")
public interface BeachController {

    @PostMapping("/{id}")
    void addBeach(@RequestBody Beach beach, @PathVariable String id);

    @GetMapping("/{id}")
    Beach getBeach(@PathVariable String id);
}
