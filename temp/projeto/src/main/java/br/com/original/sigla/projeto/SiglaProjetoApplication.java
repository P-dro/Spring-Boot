package br.com.original.sigla.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.original.sigla*")
public class SiglaProjetoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SiglaProjetoApplication.class, args);
    }
}
