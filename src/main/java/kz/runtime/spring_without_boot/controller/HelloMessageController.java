package kz.runtime.spring_without_boot.controller;

import kz.runtime.spring_without_boot.service.HelloMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
@RequiredArgsConstructor
public class HelloMessageController {
    private final HelloMessageService service;
    @GetMapping
    public String message(){
        return service.getMessage();
    }
}
