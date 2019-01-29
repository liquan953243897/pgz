package com.pgz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * //TODO 添加类功能描述
 *
 * @author: liquan@syxysoft.com
 * @date: 2018-09-20 18:15
 * @Version: 1.0
 */
@RestController
public class HiRestController {

    @GetMapping("/hi")
    public String say(String name) {
        return "name=" + name;
    }
}
