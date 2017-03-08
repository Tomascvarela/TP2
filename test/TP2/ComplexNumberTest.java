package TP2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComplexNumberTest {
ComplexNumber aNumber = new ComplexNumber(2, 2);
ComplexNumber anotherNumber = new ComplexNumber(3, 3);
	@Test
	public void testSum() {
		ComplexNumber resultNumber = aNumber.sum(anotherNumber);
		assertEquals(5, resultNumber.realPart());
		assertEquals(5, resultNumber.imaginaryPart());
	}
	@Test
	public void testSubstraction() {
		ComplexNumber resultNumber = aNumber.substract(anotherNumber);
		assertEquals(-1, resultNumber.realPart());
		assertEquals(-1, resultNumber.imaginaryPart());
	}
	@Test
	public void testMultiply() {
		ComplexNumber resultNumber = aNumber.multiply(anotherNumber);
		assertEquals(7, resultNumber.realPart());
		assertEquals(12, resultNumber.imaginaryPart());
	}
	@Test
	public void testDivision() {
		ComplexNumber resultNumber = aNumber.divide(anotherNumber);
		assertEquals(0, resultNumber.realPart());
		assertEquals(0, resultNumber.imaginaryPart());
	}
	@Test
	public void testModulus() {
		assertEquals(2.82, aNumber.modulus(), 0.01);
	}
	@Test
	public void testRealPart() {
		assertEquals(2, aNumber.realPart());
	}
	@Test
	public void testImaginaryPart() {
		assertEquals(2, aNumber.imaginaryPart());
	}
	@Test
	public void testReadFromKeyboard() {
		ComplexNumber resultNumber = aNumber.readFromKeyboard(3, 3);
		assertEquals(3, resultNumber.realPart());
		assertEquals(3, resultNumber.imaginaryPart());
	}
}
