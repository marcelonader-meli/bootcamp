package com.company.introducao_a_java_tt.exercicio1;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    1. Crie uma classe de Senha. O construtor deve receber uma regex (expressão regular)
    que valida o formato exigido para a senha. Pesquise na Internet quais recursos Java
    fornece para operar com expressões regulares.

    2. Adicione o método public void setValue (String pwd) que permite atribuir uma senha
    de acordo com a exigida pela regex do ponto anterior. Em caso de incompatibilidade,
    o método deve lançar uma exceção.

        a. Discussão: que tipo de exceção você considera mais adequada?
        b. Implemente o método conforme decidido em (2).

    3. Escreva três classes: PasswordForte, PasswordMedia, PasswordFraca, todas elas
    devem estender Password e codificar um regex de acordo com o nível de segurança
    que o nome da classe indica.
*/
public abstract class Password {

    private Pattern pattern;

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public void setValue(String pwd) throws PasswordException {
            Matcher matcher = pattern.matcher(pwd);
            Boolean res = matcher.matches();
            if(!res)
                throw new PasswordException("A senha digitada não é compatível.");
    }
}
