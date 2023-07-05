package com.onboarding.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
/*O Jakarta Validation é uma das especificações do Jakarta EE que lida com validações de dados em aplicativos.
Ele fornece um conjunto de anotações, como "@Pattern" (padrão), "@NotNull" (não nulo), "@Min" (valor mínimo) e
muitas outras, que podem ser usadas para definir regras de validação para as propriedades de objetos em uma
aplicação Java EE. */

public class UserInsertDto(
        @Size(min = 3, max = 40, message = "Name must be at least 3 and a maximum of 40.")
        @NotNull(message = "The name field cannot be null. Please enter a valid name")
        @NotBlank(message = "The name field cannot be blank. Please enter a valid name")
        String name,
        @Size(min = 3, max = 20, message = "Username must be at least 3 and a maximum of 20.")
        @NotNull(message = "The username field cannot be null. Please enter a valid username")
        @NotBlank(message = "The username field cannot be blank. Please enter a valid username")
        String username,
        @Email(message = "Enter a valid e-mail.")
        @NotNull(message = "The e-mail field cannot be null. Please enter a valid e-mail")
        @NotBlank(message = "The e-mail field cannot be blank. Please enter a valid e-mail")
        String email,
        @NotNull(message = "The password field cannot be null. Please enter a valid password")
        @NotNull(message = "The password field cannot be blank. Please enter a valid password")
        @Pattern(regexp = "^(?=.*\\d)(?=.*[A-Za-z]) (?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$",
                message = "The password must contain at least 8 characters, one letter (upper and lower case), one number and one special character.")
        /*Essa expressão regular é usada para validar uma senha, impondo algumas regras para garantir que ela
        seja segura o suficiente. Aqui está o que cada parte da expressão significa:
^: Indica o início da string.
(?=.*[A-Za-z]): Lookahead (uma espécie de verificação antecipada) que verifica se há pelo menos uma letra
maiúscula ou minúscula na senha.
(?=.*\\d): Lookahead que verifica se há pelo menos um dígito (0-9) na senha.
(?=.*[@$!%*#?&]): Lookahead que verifica se há pelo menos um dos seguintes caracteres especiais na senha: @,
$, !, %, *, #, ?, &.
[A-Za-z\\d@$!%*#?&]{8,}: A partir deste ponto, a regex verifica se a senha contém apenas letras (maiúsculas ou
minúsculas), dígitos ou os caracteres especiais mencionados (não permitindo outros caracteres) e tem um
comprimento mínimo de 8 caracteres.
$: Indica o final da string.*/
        String password {
}
