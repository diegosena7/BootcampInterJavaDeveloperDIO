package com.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

/*
Usamos a anotação @Rule para informar ao ao JUnit quais regras aplicar à sua classe de teste e nos
permite adicionar comportamentos que serão executados antes e depois de cada método de teste,
neste caso, informamos que o objeto tmpFolder será criado antes da execução do nosso teste.

Criamos um arquivo temporário usando a classe TemporaryFolder e comparamos se o arquivo foi
criado através do assertTrue e com o assertEquals comparamos se o root da pasta temporária
é o mesmo do arquivo criado.
 */
public class RuleTest {
	@Rule
    public TemporaryFolder tmpFolder = new TemporaryFolder();
 
    @Test
    public void shouldCreateNewFileInTemporaryFolder() throws IOException {
        File created = tmpFolder.newFile("file.txt");
        assertTrue(created.isFile());
        assertEquals(tmpFolder.getRoot(), created.getParentFile());
    }
}
