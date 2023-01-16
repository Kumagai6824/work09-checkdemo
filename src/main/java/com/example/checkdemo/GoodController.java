package com.example.checkdemo;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
public class GoodController {
    private final GoodServiceImpl goodServiceImpl;

    public GoodController(GoodServiceImpl goodServiceImpl) {
        this.goodServiceImpl = goodServiceImpl;
    }

    @GetMapping("/goods/{id}")
    public Good getInfo(
            @PathVariable(value = "id") int id) throws Exception {
        return goodServiceImpl.findById(id);
    }

}
