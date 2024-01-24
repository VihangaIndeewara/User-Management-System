package lk.epic.config;

import lk.epic.advicer.AppWideExceptionHandler;
import lk.epic.controller.UserController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackageClasses = {UserController.class, AppWideExceptionHandler.class})
@EnableWebMvc
public class WebAppConfig {
}
