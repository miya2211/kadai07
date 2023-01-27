package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class GetController {

    @GetMapping("/read")
    public List<String> getNames() {
        return List.of("mori","kawano");
    }
}
