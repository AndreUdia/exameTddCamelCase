package com.cabomaldade.testes;

import com.cabomaldade.app.SeparadoraCamelCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CamelCaseTestes {

    SeparadoraCamelCase classeSeparadora = new SeparadoraCamelCase();
    List<String> expectativa = new ArrayList<>();

    @Test
    public void converterDeCamelCaseParaLista() {
        expectativa.add("nome");
        assertEquals(expectativa, classeSeparadora.converterCamelCase("Nome"));
    }

    @Test
    public void converterDeCamelCaseParaListaAcimaDeUma() {
        expectativa.add("nome");
        expectativa.add("composto");
        assertEquals(expectativa, classeSeparadora.converterCamelCase("NomeComposto"));
    }

    @Test
    public void converterDeCamelCaseParaListaContendoNumeros() {
        expectativa.add("recupera");
        expectativa.add("10");
        expectativa.add("primeiros");
        assertEquals(expectativa, classeSeparadora.converterCamelCase("recupera10Primeiros"));
    }

    @Test
    public void checarSeStringEValidaComecaComNumero() {
        expectativa.add("inválido");
        assertEquals(expectativa, classeSeparadora.converterCamelCase("10Primeiros"));
    }

    @Test
    public void checarSeStringEValidaTemCaracterEspecial() {
        expectativa.add("inválido");
        assertEquals(expectativa, classeSeparadora.converterCamelCase("nome#Composto"));
    }

    @AfterEach
    void aposCada() {
        expectativa.clear();
    }
}
