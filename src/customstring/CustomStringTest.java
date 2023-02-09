
package customstring;

        import static org.junit.jupiter.api.Assertions.*;

        import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;

class CustomStringTest {

    //declare custom string for testing
    CustomString myCustomString;

    @BeforeEach
    public void setUp() throws Exception {
        //initialize custom string for testing
        this.myCustomString = new CustomString();
    }

    @Test
    void testGetString() {

        //string should be null to start, before setting it
        assertNull(this.myCustomString.getString());

        this.myCustomString.setString("hello");
        assertEquals("hello", this.myCustomString.getString());

        // TODO write at least 3 additional test cases
        this.myCustomString.setString("Green Sofa is in Kazakhstan");
        assertNotEquals("hello", this.myCustomString.getString());

        assertEquals("Green Sofa is in Kazakhstan", this.myCustomString.getString());

        this.myCustomString.setString("");
        assertEquals("", this.myCustomString.getString());
    }

    @Test
    void testSetString() {

        //string should be null to start, before setting it
        assertNull(this.myCustomString.getString());

        this.myCustomString.setString("Good-bye!");
        assertEquals("Good-bye!", this.myCustomString.getString());

        // TODO write at least 3 additional test cases
        this.myCustomString.setString("");
        assertEquals("", this.myCustomString.getString());

        assertNotEquals("Good-bye!", this.myCustomString.getString());

        this.myCustomString.setString("123@45");
        assertEquals("123@45", this.myCustomString.getString());

    }

    @Test
    void testRemove() {
        assertEquals("", this.myCustomString.remove(""));

        this.myCustomString.setString(null);
        assertEquals("", this.myCustomString.remove(""));

        this.myCustomString.setString("my lucky numbers are 6, 8, and 19.");
        assertEquals("my lucky numbes e 6, 8, nd 19.", this.myCustomString.remove("ra6"));

        // TODO write at least 3 additional test cases
        this.myCustomString.setString("abcabc 71");
        assertEquals("bcbc 71", this.myCustomString.remove("a1,"));

        this.myCustomString.setString("1234&&567");
        assertEquals("1234&&567", this.myCustomString.remove("123"));

        this.myCustomString.setString("Red Sofa is in Germany!");
        assertEquals("Red Sofa is in Germany!", this.myCustomString.remove("!"));

    }

    @Test
    void testReverse() {
        assertEquals("", this.myCustomString.reverse(""));

        this.myCustomString.setString(null);
        assertEquals("", this.myCustomString.reverse(""));

        //this.myCustomString.setString("q r s");
        //assertEquals("Q R S", this.myCustomString.reverse("qrs"));

        this.myCustomString.setString("abc, XYZ; 123.");
        assertEquals("aBC, xyz; 123.", this.myCustomString.reverse("bcdxyz@3210."));

        // TODO write at least 3 additional test cases


        this.myCustomString.setString("y%Y, k%K, lollipop");
        assertEquals("Y%y, K%k, lollipop", this.myCustomString.reverse("yk%"));

        this.myCustomString.setString("a,y,k,%,K");
        assertEquals("A,Y,K,%,k", this.myCustomString.reverse("123,ayk"));

    }

    @Test
    void testFilterLetters() {
        assertEquals("", this.myCustomString.filterLetters('E', false));

        this.myCustomString.setString(null);
        assertEquals("", this.myCustomString.filterLetters('E', false));

        // TODO write at least 3 additional test cases
        /*
        * Example(s):
         * - For a current string "Hello 90, bye 2", calling filterLetters('h', false) would return "llo 90, y 2"
         * - For a current string "Abcdefg", calling filterLetters('c', false) would return "defg"
         * - For a current string "Hello 90, bye 2", calling filterLetters('h', true) would return "e 90, be 2"
         * - For a current string "Abcdefg", calling filterLetters('c', true) would return "Ab"
        * */
        this.myCustomString.setString("Hello 90, bye 2");
        assertEquals("llo 90, y 2", this.myCustomString.filterLetters('h', false));

        //assertEquals("e 90, be 2", this.myCustomString.filterLetters('h', true));

        this.myCustomString.setString("Abcdefg");
        assertEquals("defg", this.myCustomString.filterLetters('c', false));

        assertEquals("Ab", this.myCustomString.filterLetters( 'c', true));

    }

}