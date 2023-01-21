package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@ConfiguracaoDesenvolvimento
public class MinhaConfiguration {

    @Bean
    public CommandLineRunner executar() {
        return args -> {
            System.out.println("ROANDO A CONFIGURAÇÃO DE DESENVOLVIMENTO");
        };
    }
}
