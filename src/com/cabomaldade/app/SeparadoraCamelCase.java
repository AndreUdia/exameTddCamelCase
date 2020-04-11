package com.cabomaldade.app;

import java.util.ArrayList;
import java.util.List;

public class SeparadoraCamelCase {
    private final List<String> listaSeparada = new ArrayList<>();

    public List<String> converterCamelCase(String original) {
        if (!validaCamelCase(original) ){
            listaSeparada.add(original.toLowerCase());
        } else if (!original.matches(".*\\d.*")){
            adicionaPalavras(original.split("(?=[A-Z])"));
        } else {
            adicionaLetrasENumeros(original.split("(?=[A-Z])"));
        }

        return this.listaSeparada;
    }

    private void adicionaPalavras(String[] palavrasEmCamelCase){
        int i = 0;
        while (i < palavrasEmCamelCase.length){
            listaSeparada.add(palavrasEmCamelCase[i].toLowerCase());
            i ++;
        }
    }

    private void adicionaLetrasENumeros(String[] letrasComNumeros){
        int i = 0;
        while (i < letrasComNumeros.length){
            if (letrasComNumeros[i].matches(".*\\d.*")) {
                trataArrayLetrasENumeros(letrasComNumeros[i].split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)"));
            } else{
                listaSeparada.add(letrasComNumeros[i].toLowerCase());
            }
            i ++;
        }
    }
    private void trataArrayLetrasENumeros(String[] array){
        int i = 0;
        while (i < array.length){
            listaSeparada.add(array[i].toLowerCase());
            i ++;
        }
    }

    private boolean validaCamelCase(String original) {
        for (int i=1; i< original.length(); i++) {
            if (Character.isUpperCase(original.charAt(i)) || Character.isDigit(original.charAt(i))) {
                return true;
            }
        }
        return false;
    }

}
