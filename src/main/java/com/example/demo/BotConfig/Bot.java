package com.example.demo.BotConfig;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.Resources;

@Configuration
@Data
@PropertySource("application.properties")
public class Bot {
    @Value("${telegram.name}")
    String userName;
    @Value("${telegram.token}")
    String token;
}
