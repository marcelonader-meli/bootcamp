package com.company.introducao_a_java_tt.exercicio1;

import java.util.regex.Pattern;

public class PasswordForte extends Password{

    public PasswordForte(Pattern compile) {
        super();
        this.setPattern(compile);
    }

}
