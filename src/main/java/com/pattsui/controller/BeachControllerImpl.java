package com.pattsui.controller;

import com.pattsui.model.Beach;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/beach")
public class BeachControllerImpl implements BeachController {

    @Override
    public void addBeach(Beach beach, String id) {

    }

    @Override
    public Beach getBeach(String id) {
        return new Beach(id, false);
    }
}
