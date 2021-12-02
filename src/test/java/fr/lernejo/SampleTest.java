package fr.lernejo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    static final Sample s = new Sample();

    @org.junit.jupiter.api.Test
    void zeroAndZero() {
        assertEquals(0, s.op(Sample.Operation.ADD, 0,0));
    }

    @org.junit.jupiter.api.Test
    void zeroMultZero(){
        assertEquals(0, s.op(Sample.Operation.MULT, 0,0));
    }

    @org.junit.jupiter.api.Test
    void minusOneMultMinusOne(){
        assertEquals(1, s.op(Sample.Operation.MULT, -1,-1));
    }

    @org.junit.jupiter.api.Test
    void factNeg(){
        assertThrows(IllegalArgumentException.class, () -> new Sample().fact(-1));
    }

    @Test
    void fact4(){
        assertEquals(24, new Sample().fact(4));
    }

    @Test
    void factOne() {
        assertEquals(1, new Sample().fact(1));
    }
}
