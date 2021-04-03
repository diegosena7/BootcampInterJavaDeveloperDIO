package com.teste;

import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matchers;
import org.hamcrest.beans.HasProperty;
import org.hamcrest.object.HasToString;
import org.junit.Test;

/*
O Matcher tem a função de verificar se um dado objeto tem as propriedades desejadas.
 */
public class MatcherTest {

	//Verifica se a string informada em person é a mesma que em str com o HasToString.hasToString
	@Test
	public void givenBean_checkToString(){
	    Person person = new Person("Barrack", "Obama");
	    String str = person.toString();
	    assertThat(person, HasToString.hasToString(str));
	}

	//Verifica se o objeto da nossa classe Person possui o atributo name
	@Test
	public void givenBean_checkPropertyExists() {
		Person person = new Person("Barrack", "Obama");
	    assertThat(person, HasProperty.hasProperty("name"));
	}
	
	//Verifica se a lista emptyList está vazia através do Matchers.empty
	@Test
	public void givenCollection_checkEmpty() {
	    List<String> emptyList = new ArrayList<String>();
	    assertThat(emptyList, Matchers.empty());
	}

	//Verifica se o valor atual é maior que o recebido como parâmetro usando Matchers.greaterThan
	@Test
	public void givenAnInteger_checkGreater() {
	    assertThat(1, Matchers.greaterThan(0));
	}

	//Verifica se a string é null, usando este método deve retornar true
	@Test
	public void givenString_checkNull() {
	    String str = null;
	    assertThat(str, Matchers.isEmptyOrNullString());
	}
}

