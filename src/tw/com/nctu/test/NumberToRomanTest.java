package tw.com.nctu.test;

import static org.junit.Assert.*;

import org.junit.Test;

import tw.com.nctu.NumberToRoman;

public class NumberToRomanTest {

	@Test
	public void send1receiveI() {
		NumberToRoman n = new NumberToRoman();
		assertEquals("We send 1 but the class didn't send I to us", "I", n.print(1));
	}
	
	@Test
	public void send2receiveII() {
		NumberToRoman n = new NumberToRoman();
		assertEquals("We send 2 but the class didn't send II to us", "II", n.print(2));
	}
	
	@Test
	public void send3receiveIII() {
		NumberToRoman n = new NumberToRoman();
		assertEquals("We send 3 but the class didn't send III to us", "III", n.print(3));
	}
	
	@Test
	public void send5receiveV() {
		NumberToRoman n = new NumberToRoman();
		assertEquals("We send 5 but the class didn't send V to us", "V", n.print(5));
	}
	
	@Test
	public void send10receiveX() {
		NumberToRoman n = new NumberToRoman();
		assertEquals("We send 10 but the class didn't send X to us", "X", n.print(10));
	}
	
	@Test
	public void send50receiveL() {
		NumberToRoman n = new NumberToRoman();
		assertEquals("We send 50 but the class didn't send L to us", "L", n.print(50));
	}
	
	@Test
	public void send100receiveC() {
		NumberToRoman n = new NumberToRoman();
		assertEquals("We send 100 but the class didn't send C to us", "C", n.print(100));
	}
	
	@Test
	public void send500receiveD() {
		NumberToRoman n = new NumberToRoman();
		assertEquals("We send 500 but the class didn't send D to us", "D", n.print(500));
	}
	
	@Test
	public void send1000receiveM() {
		NumberToRoman n = new NumberToRoman();
		assertEquals("We send 1000 but the class didn't send M to us", "M", n.print(1000));
	}
	
	@Test
	public void send4receiveIV() {
		NumberToRoman n = new NumberToRoman();
		assertEquals("We send 4 but the class didn't send IV to us", "IV", n.print(4));
	}
	
	@Test
	public void SendANumberOutOfOurRangeAndReturnNothing(){
		NumberToRoman n = new NumberToRoman();
		assertEquals("", "", n.print(0));
		assertEquals("", "", n.print(3001));
		assertEquals("", "", n.print(6754));
	}
	
	@Test
	public void testNumberWithOnly1Digit() {
		NumberToRoman n = new NumberToRoman();
		for (int i = 1 ; i <= 3000 ; i++) {
			boolean result = n.isLevel1(i);
			if (i >= 1 && i <= 9){
			assertEquals("Error happened with value " + i, true, result);
			}else {
			assertEquals("Error happened with value " + i, false, result);
			}
		}
		
	}
	
	@Test
	public void testNumberWithOnly2Digit() {
		NumberToRoman n = new NumberToRoman();
		for (int i = 1 ; i <= 3000 ; i++) {
			boolean result = n.isLevel2(i);
			if (i >= 10 && i <= 99){
			assertEquals("Error happened with value " + i, true, result);
			}else {
			assertEquals("Error happened with value " + i, false, result);
			}
		}
		
	}
	
	@Test
	public void testNumberWithOnly3Digit() {
		NumberToRoman n = new NumberToRoman();
		for (int i = 1 ; i <= 3000 ; i++) {
			boolean result = n.isLevel3(i);
			if (i >= 100 && i <= 999){
			assertEquals("Error happened with value " + i, true, result);
			}else {
			assertEquals("Error happened with value " + i, false, result);
			}
		}
		
	}
	
	@Test
	public void testNumberWithOnly4Digit() {
		NumberToRoman n = new NumberToRoman();
		for (int i = 1 ; i <= 3000 ; i++) {
			boolean result = n.isLevel4(i);
			if (i >= 1000 && i <= 3000){
			assertEquals("Error happened with value " + i, true, result);
			}else {
			assertEquals("Error happened with value " + i, false, result);
			}
		}
		
	}
}