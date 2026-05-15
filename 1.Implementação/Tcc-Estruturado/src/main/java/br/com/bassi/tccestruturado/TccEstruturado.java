package br.com.bassi.tccestruturado;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class TccEstruturado {

	public static void main(String[] args) {
		SpringApplication.run(TccEstruturado.class, args);
	}
}
