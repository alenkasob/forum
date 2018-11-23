package com.frm;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        final Map<String, Object> props = new HashMap<>();
        props.put("server.port", 8081);

        new SpringApplicationBuilder()
                .sources(App.class)
                .properties(props)
                .run(args);
    }
}