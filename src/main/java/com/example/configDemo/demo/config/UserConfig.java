package com.example.configDemo.demo.config;

import lombok.Data;
import lombok.NonNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;

@Data
@Component
@ConfigurationProperties(prefix="user")
public class UserConfig {

    private String defaultName;
    private String city;
    private boolean enabled;
    private List<String> roles;
    private Map<String, Object> metadata;

}
