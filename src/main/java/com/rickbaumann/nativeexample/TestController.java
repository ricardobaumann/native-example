package com.rickbaumann.nativeexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/tests")
    public TestResult get() {
        return new TestResult("bar");
    }

}
