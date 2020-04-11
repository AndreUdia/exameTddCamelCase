package com.cabomaldade.testes;

import com.cabomaldade.app.SeparadoraCamelCase;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CamelCaseTestes {

    @Test
    public void converterDeCamelCaseParaLista() {
        SeparadoraCamelCase classeSeparadora = new SeparadoraCamelCase();
        List<String> expectativa = new ArrayList<>();
        expectativa.add("nome");
        assertEquals(expectativa, classeSeparadora.converterCamelCase("Nome"));
    }

    @Test
    public void converterDeCamelCaseParaListaAcimaDeUma() {
        SeparadoraCamelCase classeSeparadora = new SeparadoraCamelCase();
        List<String> expectativa = new ArrayList<>();
        expectativa.add("nome");
        expectativa.add("composto");
        assertEquals(expectativa, classeSeparadora.converterCamelCase("NomeComposto"));
    }

    // recupera10Primeiros - “recupera”, “10”, “primeiros”
    @Test
    public void converterDeCamelCaseParaListaContendoNumeros() {
        SeparadoraCamelCase classeSeparadora = new SeparadoraCamelCase();
        List<String> expectativa = new ArrayList<>();
        expectativa.add("recupera");
        expectativa.add("10");
        expectativa.add("primeiros");
        assertEquals(expectativa, classeSeparadora.converterCamelCase("recupera10Primeiros"));
    }


}
