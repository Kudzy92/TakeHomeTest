package app.kudzy.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HammingBitsCheckerImplTest {
@Test
void checkCorruptedBits(){
    var  hbc=new HammingBitsCheckerImpl();
    assertEquals(0,hbc.bitsChecker("0101100000010010"));
}
@Test
void checkCorruptedBits2(){
    var  hbc=new HammingBitsCheckerImpl();
    assertEquals(1,hbc.bitsChecker("0001011001111010"));
}
@Test
void checkCorruptedBits3(){
        var  hbc=new HammingBitsCheckerImpl();
        assertEquals(1,hbc.bitsChecker("0011101000101001"));
    }
@Test
void checkNotCorruptedBits(){
        var  hbc=new HammingBitsCheckerImpl();
        assertEquals(1,hbc.bitsChecker("0010101011111111"));
}
@Test
void checkNotCorruptedBits2(){
        var  hbc=new HammingBitsCheckerImpl();
        assertEquals(0,hbc.bitsChecker("0011110100110011"));
    }
@Test
void checkInputBitsWithLetters(){
        var  hbc=new HammingBitsCheckerImpl();
        assertTrue(hbc.validateBits("12dfgjljljlxcvhg")==false);
}
@Test
void checkInputBitsWithLongLength(){
        var  hbc=new HammingBitsCheckerImpl();
        assertTrue(hbc.validateBits("001010101111111101010111101100101")==false);
}
@Test
void checkInputBitsNotStartingWithZero(){
        var  hbc=new HammingBitsCheckerImpl();
        assertTrue(hbc.validateBits("1111000100101000")==false);
    }

@Test
void checkInputBitsNotStartingWithSpace(){
        var  hbc=new HammingBitsCheckerImpl();
        assertTrue(hbc.validateBits("0111 0001 0010 1000")==true);
    }
}