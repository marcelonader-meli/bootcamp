package com.company.introducao_a_java_tt.exercicio1;

public class PasswordException extends Exception{

    public PasswordException(){
        super();
    }

    public PasswordException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Ocorreu a seguinte exceção: " + this.getClass().getName() + "\nMensagem: " + this.getMessage() + "\n";
    }
}
