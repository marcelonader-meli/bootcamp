package com.company.introducao_a_java_tt.exercicio1;


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

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws PasswordException {

//      Mínimo de oito caracteres, pelo menos uma letra e um número:
        PasswordFraca passwordFraca = new PasswordFraca(Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$", Pattern.MULTILINE));
//        Mínimo de oito caracteres, pelo menos uma letra, um número e um caractere especial:
        PasswordMedia passwordMedia = new PasswordMedia(Pattern.compile("^(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*#?&])[a-z\\d@$!%*#?&]{8,}$", Pattern.MULTILINE));
//        Mínimo de oito caracteres, pelo menos uma letra maiúscula, uma letra minúscula, um número e um caractere especial:
        PasswordForte passwordForte = new PasswordForte(Pattern.compile("^(?=.*?[A-Z])(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{8,}$", Pattern.MULTILINE));

        Scanner scan = new Scanner(System.in);
        System.out.println("\n===================REGRAS DAS SENHAS===================\n");
        System.out.println("SENHA FRACA:" +
                "\n  - Mínimo de oito caracteres;" +
                "\n  - Pelo menos uma letra (letras maiúsculas ou minúsculas);" +
                "\n  - Pelo menos um número.\n");
        System.out.println("SENHA MÉDIA:" +
                "\n  - Mínimo de oito caracteres;" +
                "\n  - Pelo menos uma letra (apenas letras minúsculas);" +
                "\n  - Pelo menos um número;" +
                "\n  - Pelo menos um caractere especial.\n");
        System.out.println("SENHA FORTE:" +
                "\n  - Mínimo de oito caracteres;" +
                "\n  - Pelo menos uma letra minúscula;" +
                "\n  - Pelo menos uma letra maiuscula;" +
                "\n  - Pelo menos um número;" +
                "\n  - Pelo menos um caractere especial.\n");

        System.out.print("Digite a senha: ");
        String passwordUser = scan.nextLine();

        try{
            passwordFraca.setValue(passwordUser.trim());
            System.out.println("SENHA FRACA\nO nível de segurança da senha digitada é fraca.\n");
        } catch (Exception e){
            System.out.println("Incompatível com as regras da senha fraca.");
            System.out.println(e);
        }

        try{
            passwordMedia.setValue(passwordUser.trim());
            System.out.println("SENHA MÉDIA\nO nível de segurança da senha digitada é média.\n");
        } catch (Exception e){
            System.out.println("Incompatível com as regras da senha média.");
            System.out.println(e);
        }

        try{
            passwordForte.setValue(passwordUser.trim());
            System.out.println("SENHA FORTE\nO nível de segurança da senha digitada é forte.\n");
        } catch (Exception e){
            System.out.println("Incompatível com as regras da senha forte.");
            System.out.println(e);
        }

    }
}
