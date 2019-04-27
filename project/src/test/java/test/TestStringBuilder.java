package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import project.StringBuilder;

public class TestStringBuilder {
	
	@Test
	public void test()
	{
		StringBuilder st = new StringBuilder();
		String resultado = st.juntaTexto("junta", "texto");
		
		assertEquals("juntatexto", resultado);
	}
}
