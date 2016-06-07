package com.stealthydev.open.ghostio.controller;

import com.stealthydev.open.ghostio.model.Layout;
import com.stealthydev.open.ghostio.service.LayoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/layouts")
public class LayoutsController {

    @Autowired
    LayoutService layoutService;

    @RequestMapping("")
    public List<Layout> list() throws IOException {
        return layoutService.list();
    }

}
