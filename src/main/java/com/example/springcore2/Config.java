package com.example.springcore2;


import com.example.springcore2.emity.Auto;
import com.example.springcore2.emity.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.springcore2")
public class Config {
    @Bean
    public Auto auto(Engine engine){
        return new Auto(1,engine,"BMW");
    }
    @Bean
    public Auto auto2(Engine engine2){
        return new Auto(2,engine2,"LEXUS");
    }
    @Bean
    public Auto auto3(Engine engine3){
        return new Auto(3, engine3,"LADA");
    }
    @Bean
    public Engine engine(){
        return new Engine(1,100);
    }
    @Bean
    public Engine engine2(){
        return new Engine(2,200);
    }
    @Bean
    public Engine engine3(){
        return new Engine(3,300);
    }

}
