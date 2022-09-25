package com.example.beanvalidation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class EmailController {

    @PostMapping("/email/with-not-null")
    public String withNotNull(@RequestBody @Validated final WithNotNullRequest request) {
        log.info("### withNotNull email={}", request.email());
        return request.email();
    }

    @PostMapping("/email/without-not-null")
    public String withoutNotNull(@RequestBody @Validated final WithoutNotNullRequest request) {
        log.info("### withoutNotNull email={}", request.email());
        return request.email();
    }
}
