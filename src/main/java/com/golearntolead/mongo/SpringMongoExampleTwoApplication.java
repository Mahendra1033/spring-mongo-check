package com.golearntolead.mongo;

import com.golearntolead.mongo.entity.Address;
import com.golearntolead.mongo.entity.Gender;
import com.golearntolead.mongo.entity.Student;
import com.golearntolead.mongo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class SpringMongoExampleTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoExampleTwoApplication.class, args);
	}

}
