package com.onboarding.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;


public interface UserRepository extends JpaRepository<User, String> {
    /*extends JpaRepository<User, String>: Aqui, a interface UserRepository extends a interface JpaRepository, onde
     User é a entidade JPA (geralmente uma classe de modelo que representa uma tabela do banco de dados) que será
     manipulada pelo repositório, e String é o tipo do identificador único da entidade (o tipo da chave primária).
     Em outras palavras, o UserRepository será capaz de executar operações de banco de dados relacionadas à
     entidade User e usará String como tipo de ID para a entidade User.*/
    Optional<User> findByUsernameOrEmail(String username, String email);
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
}

/*Optional<User> findByUsername(String username): Este método permite buscar um usuário pelo seu nome de usuário
(username). Ele retorna um Optional que pode conter o usuário encontrado ou um valor vazio (null).

Optional<User> findByUsernameOrEmail(String username): Este método também permite buscar um usuário pelo nome
de usuário ou pelo email.

Optional<User> findByEmail(String email): Este método permite buscar um usuário pelo endereço de e-mail (email).
Assim como os outros métodos, ele retorna um Optional que pode conter o usuário encontrado ou um valor vazio (null).*/
