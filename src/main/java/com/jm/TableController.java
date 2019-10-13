package com.jm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TableController {

    @RequestMapping("/JM")
    public String writeJM(){
        return "JM";
    }
}
