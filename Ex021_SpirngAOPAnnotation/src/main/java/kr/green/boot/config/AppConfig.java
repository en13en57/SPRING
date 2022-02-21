package kr.green.boot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(value = "kr.green.boot")
@EnableAspectJAutoProxy
public class AppConfig {

}
