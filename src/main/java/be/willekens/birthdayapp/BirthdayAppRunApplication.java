package be.willekens.birthdayapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class BirthdayAppRunApplication {
    public static void main(String[] args) {
        if (log.isTraceEnabled()) {
            log.trace("Starting application with following runtime arguments:");
            for (String arg : args) {
                log.trace("Argument: {}", arg);
            }
        }
        SpringApplication.run(BirthdayAppRunApplication.class, args);
    }

}
