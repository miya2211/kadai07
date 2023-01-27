package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class NamesGetController { //何をGetするControllerかわかるように

    @GetMapping("/names") //扱うリソースの複数形
    public List<String> getNames() {
        return List.of("mori", "kawano"); //"kawano"前のスペース
    }
}
