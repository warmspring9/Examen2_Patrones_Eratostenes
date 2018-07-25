package com.ucenfotec.eratostenes.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.ucenfotec.eratostenes.CribaEratostenes;

public class CribaEratostenesTest {
	CribaEratostenes eratostenes;
	int[] list;
	
	@Test
	public void testListaUno() {
		list = new int[0];
		assertTrue(Arrays.equals(list, CribaEratostenes.generaCriba(1)));
	}
	
	@Test
	public void testLista10() {
		list = new int[]{2,3,5,7};
		assertTrue(Arrays.equals(list, CribaEratostenes.generaCriba(9)));
	}
	@Test
	public void testLista20() {
		list = new int[]{2,3,5,7,11,13,17,19};
		assertTrue(Arrays.equals(list, CribaEratostenes.generaCriba(20)));
	}

}
