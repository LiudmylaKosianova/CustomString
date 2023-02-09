package luckytwin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCustomTest {
    StringCustom myStringCustom;


    @BeforeEach
    void setUp() {
        this.myStringCustom = new StringCustom();
    }

    @Test
    void reverse() {
        assertEquals("", this.myStringCustom.reverse(""));

        this.myStringCustom.setString(null);
        assertEquals("", this.myStringCustom.reverse(""));

        this.myStringCustom.setString("abc, XYZ; 123.");

        assertEquals("aBC, xyz; 123.", this.myStringCustom.reverse("bcdxyz@3210."));

        this.myStringCustom.setString("abc yk abc");
        assertEquals("abc YK abc", this.myStringCustom.reverse("%yk"));


    }
}