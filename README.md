# demo-spring-security

Explicación: 

- Agregar la dependencia de Spring Security : 

```
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-security</artifactId>
</dependency>

<dependency>
<groupId>org.springframework.security</groupId>
<artifactId>spring-security-test</artifactId>
<scope>test</scope>
</dependency>
```

- A la clase main agregar: ```(exclude = {UserDetailsServiceAutoConfiguration.class```
```
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication(exclude = {UserDetailsServiceAutoConfiguration.class})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
```

- Agregar la WebSecurityConfig en el metodo protected void configure(HttpSecurity http) throws Exception se agregar la clase AuthenticationTokenFilter el cual atiende los request para la validación del token. Y en el método public void configure(WebSecurity web) throws Exception se pueden agregar excepciones para no validar el token.

- La clase AuthenticationTokenFilter se realiza la validación del token el cual se puede hacer, llamando a un tercero para la validación o implementar JWT si gustan, en fin esta clase tiene la lógica la seguridad.
