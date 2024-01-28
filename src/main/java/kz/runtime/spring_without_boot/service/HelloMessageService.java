package kz.runtime.spring_without_boot.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Getter
@Service
public class HelloMessageService {
    private final String message;

    public HelloMessageService(@Value("${message:Hello!}") String message) {
        this.message = message;
    }

}
