package kz.runtime.spring_without_boot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@PropertySource(value = "file:/etc/myapp/myapp.properties", ignoreResourceNotFound = true)
public class AppConfig {
}
