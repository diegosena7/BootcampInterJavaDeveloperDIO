package com.teste;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class AssertTest {

	  @Test
	  public void testAssertArrayEquals() {
	    byte[] esperado = "teste".getBytes();
	    byte[] atual = "teste".getBytes();
	    assertArrayEquals(esperado, atual);
	  }

	  //Verifica se os valores são iguais
	  @Test
	  public void testAssertEquals() {
	  	assertEquals("text", "text");
	  }

	  //Teste false
	  @Test
	  public void testAssertFalse() {
	  	assertFalse(false);
	  }

	  //Verifica se o objeto não é null
	  @Test
	  public void testAssertNotNull() {
	  	assertNotNull(new Object());
	  }

	  //Verifica se os objetos não são os mesmos
	  @Test
	  public void testAssertNotSame() {
	  	assertNotSame(new Object(), new Object());
	  }

	  //Verifica se o objeto é null
	  @Test
	  public void testAssertNull() {
	  	assertNull(null);
	  }

	  //Verifica se o objeto é o mesmo
	  @Test
	  public void testAssertSame() {
	    Integer aNumber = Integer.valueOf(768);
	    assertSame(aNumber, aNumber);
	  }  
}
