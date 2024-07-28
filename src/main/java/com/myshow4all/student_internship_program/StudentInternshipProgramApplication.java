package com.myshow4all.student_internship_program;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import jakarta.validation.constraints.Max;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableAsync
@OpenAPIDefinition(
		info = @Info
				(
						title = "Spring Boot MIMS REST APIs",
						description = "Spring Boot MIMS REST APIs Documentation",
						version = "v1.0",
						contact = @Contact
								(
								  name = "Bala Krishna",
								  email = "balakrishna0882@gmail.com"
								),

						license = @License
								(
								  name = "Apache2.0"
								)

				),
		externalDocs = @ExternalDocumentation
								(
							      description = "Spring Boot IMIS Documentation",
								  url = "https://github.com/Balakrishna1308/full-stack-internship-app"
								)

)

//@OpenAPIDefinition
//		(
//				info = @Info
//						(
//								title = "Spring Boot MIMS REST APIs",
//								description = "Spring Boot MIMS REST APIs Documentation",
//								version = "1.0",
//								contact = @Contact
//								(
//										name = "Bala Krishna",
//										email = "balakrishna.malipeddi@gmail.com"
//								),
//								license = @License
//										(
//										   name = "Apache2.0"
//										)
//						),
//				externalDocs = @ExternalDocumentation
//						(
//								description = "Srping Boot MIMS Documention",
//								url ="https://github.com/Balakrishna1308/full-stack-internship-app"
//
//						)
//
//
//
//		)

public class StudentInternshipProgramApplication {

	public static void main(String[] args) {SpringApplication.run(StudentInternshipProgramApplication.class, args);
	}

}