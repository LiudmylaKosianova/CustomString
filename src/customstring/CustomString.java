package customstring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

/**
 * In this assignment, you will implement a simple class called CustomString.  This class represents a more customizable version
 * of a String, with additional attributes and methods.
 * For example, the CustomString class has a “reverse” method which returns a new string version of the current string where the
 * capitalization is reversed (i.e., lowercase to uppercase and uppercase to lowercase) for the alphabetical characters specified
 * in the given arg.  For CustomString “abc, XYZ; 123.”, calling reverse("bcdxyz@3210.") will return "aBC, xyz; 123.".
 *
 * The CustomString class also has a “remove” method which returns a new string version of the current string where the alphabetical
 * characters specified in the given arg, are removed.  For CustomString "my lucky numbers are 6, 8, and 19.", calling remove("ra6")
 * will return "my lucky numbes e 6, 8, nd 19.".
 *
 */
public class CustomString {

    //instance variables

    /**
     * Current string.
     */
    String myString;

    /**
     * Indicates if the current string myString has been set (not null).
     */
    boolean isSet;

    //constructor

    /**
     * Initializes current string myString to null.
     * Initializes isSet to false.
     */
    public CustomString() {
        this.myString = null;
        this.isSet = false;
    }

    // methods

    /**
     * Returns the current string.
     * If the current string is null, or has not been set to a value with setString, it should return null.
     * @return current string
     */
    public String getString() {
        // TODO Implement method
        if (this.myString!=null){
            return this.myString;
        }else{
            return null;}
    }

    /**
     * Sets the value of the current string and sets this.isSet to true.
     * If the given string is null, sets this.isSet to false.
     * @param string value to be set
     */
    public void setString(String string) {
        // TODO Implement method
        this.myString = string;
        this.isSet = true;
    }

    /**
     * Takes the string as an argument and removes all characters that are not letters
     * @param arg is just a string with different characters
     * @return a string that contains only letters
     */
    public String cleanArg(String arg){
        String newArg = "";
        char[] argArray = arg.toCharArray();
        //loop through the argArray
        for(char i:argArray){
            if(Character.isLetter(i)){
                newArg+=i;
            }
        }
        return newArg;
    }

    /**
     * Returns a new string version of the current string where the alphabetical characters specified in the given arg, are removed.
     *
     * The alphabetical characters to be removed are case insensitive.
     * All non-alphabetical characters are unaffected.
     * If the current string is null, empty, or has not been set to a value, this method should return an empty string.
     *
     * Example(s):
     * - For a current string "my lucky numbers are 6, 8, and 19.", calling remove("ra6") would return "my lucky numbes e 6, 8, nd 19."
     * - For a current string "my lucky numbers are 6, 8, and 19.", calling remove("6,.") would return "my lucky numbers are 6, 8, and 19."
     * - For a current string "my lucky numbers are 6, 8, and 19.", calling remove("") would return "my lucky numbers are 6, 8, and 19."
     *
     * Remember: This method builds and returns a new string, and does not directly modify the myString field.
     *
     * @param arg the string containing the alphabetical characters to be removed from the current string
     * @return new string in which the alphabetical characters specified in the arg are removed
     */

    public String remove(String arg) {
        // TODO Implement method
        if(this.myString==null|| this.myString==""){return "";}
        if (arg==""){ return this.myString;}

        //it works so far
        //let's create the modified string:

        String newArg = "";

        //loop through the array that will be created from arg string
        for(char i: arg.toCharArray()){
            if(Character.isLetter(i)){newArg+=i;}
        }


        //String[] greenSofa = this.myString.split("");
        //String sitro= "";
        //for(String s: greenSofa){
        //    if(newArg.contains(s)){

        //    }else{
        //        sitro += s;
        //    }
        //}
        //return sitro;

        String sitro="";
        char red;

        for (char green : this.myString.toCharArray()){
            if(Character.isLetter(green)){
                if(Character.isUpperCase(green)){
                    red = Character.toLowerCase(green);
                }else{red = Character.toUpperCase(green);}
                if(newArg.contains(String.valueOf(green)) || newArg.contains(String.valueOf(red))){

                }else{sitro+=green;}

            }else{sitro+=green;}
        }
        return sitro;

        /**
         String modify = this.myString;
         //cast String arg into array, because I will use it in the loop
         char[] argArray = arg.toCharArray();
         //loop through the argArray
         for(char i:argArray){
         if(Character.isLetter(i)){
         String wow = String.valueOf(i);
         String newModify = modify.replace(wow, "");
         }
         }


         /**
         //convert the new string into array
         char[] modifyArray = modify.toCharArray();
         //create a new empty array
         char[] newModifyArray = new char[0];
         //cast String arg into array, because I will use it in the loop
         char[] argArray = arg.toCharArray();
         int y = 0;
         for (char i : modifyArray){
         //for(char j : argArray){
         //if(Character.isLetter(j) && i!=j){
         //newModifyArray[y] = i;

         //}
         newModifyArray[y]=i;
         y++;

         }

         //4. cast the new array into string
         String modified = new String(newModifyArray);
         //return the new string*/

    }

    /**
     * Returns a new string version of the current string where the capitalization is reversed (i.e., lowercase to uppercase,
     * and uppercase to lowercase) for the alphabetical characters specified in the given arg.
     *
     * All non-alphabetical characters are unaffected.
     * If the current string is null, empty, or has not been set to a value, this method should return an empty string.
     *
     * Example(s):
     * - For a current string "abc, XYZ; 123.", calling reverse("bcdxyz@3210.") would return "aBC, xyz; 123."
     * - For a current string "abc, XYZ; 123.", calling reverse("6,.") would return "abc, XYZ; 123."
     * - For a current string "abc, XYZ; 123.", calling reverse("") would return "abc, XYZ; 123."
     * - For a current string "", calling reverse("") would return ""
     *
     * Remember: This method builds and returns a new string, and does not directly modify the myString field.
     *
     * @param arg the string containing the alphabetical characters to have their capitalization reversed in the current string
     * @return new string in which the alphabetical characters specified in the arg are reversed
     */
    public String reverse(String arg) {
        // TODO Implement method
        if(this.myString==null|| this.myString==""){return "";}
        if (arg==""){ return this.myString;}

        String newArg = "";
        for(char i: arg.toCharArray()){
            if(Character.isLetter(i)){newArg+=i;}
        }

        String citron = "";
        char[] myChars = this.myString.toCharArray();
        char myCharReversed;

        for (char myChar : myChars){
            if(Character.isLetter(myChar)){
                //reverse the case of myChar because I want to have myChar and myCharReversed
                if(Character.isUpperCase(myChar)){
                    myCharReversed = Character.toLowerCase(myChar);
                }else {
                    myCharReversed = Character.toUpperCase(myChar);
                }

                if( newArg.contains(String.valueOf(myChar)) || newArg.contains(String.valueOf(myCharReversed))){
                    citron+=myCharReversed;
                }  else {citron+=myChar;}

            }else{citron+=myChar;}
        }
        return citron;

        //the session will end in 5 min
        //Bye bye
        //     String sitro = "";

        //      for (int i = 0; i < arg.length(); i++) {
        //          Character a = arg.charAt(i);
        //          String b = a.toString();
        //          if (this.myString.contains(b) || b.) {
//
        //           }
        //      }


/**
        boolean found = false;
        String[] greenSofa = this.myString.split("");// I can iterate through greenSofa
        String sitro= "";
        String[] redSofa = newArg.split("");//I can iterate through redSofa
        for (String fromGreen: greenSofa){
            if(!Character.isLetter(fromGreen.charAt(0))){sitro+=fromGreen;}
            for (String fromRed: redSofa){
                if(fromRed.compareToIgnoreCase(fromGreen)==0){
                    found = true;
                    //convert fromGreen into character fromGreenChar
                    char fromGreenChar = fromGreen.charAt(0);
                    //check the case of the fromGreenChar
                    // reverse the case of the fromGreenChar and put it into sitro
                    if(Character.isLowerCase(fromGreenChar)){
                        sitro+=Character.toUpperCase(fromGreenChar);
                        break; //hopefully breaks from the current loop and grabs next fromGreen
                    }else{
                        sitro+=Character.toLowerCase(fromGreenChar);
                        break;
                    }
                }
            }if (!found){sitro+=fromGreen;}

        }

        /**
         char[] greenSofa = this.myString.toCharArray();
         String sitro= "";
         for(char s: greenSofa){
         //lets cast character s into string
         String newS = String.valueOf(s);
         if(newArg.contains(newS)){
         //lets cast string newS into character again)
         char againNewS = newS.charAt(0);
         if(Character.isLowerCase(againNewS)){
         char changes = Character.toUpperCase(againNewS);
         sitro+=changes;
         }else{
         char changes = Character.toLowerCase(againNewS);
         sitro+=changes;
         }
         }else{
         sitro+=newS;
         }

         }*/

    }

    /**
     * Returns a new string version of the current string where all the letters either >= or <= the given char n, are removed.
     *
     * The given letter may be a-z or A-Z, inclusive.
     * The letters to be removed are case insensitive.
     *
     * If 'more' is false, all letters less than or equal to n will be removed in the returned string.
     * If 'more' is true, all letters greater than or equal to n will be removed in the returned string.
     *
     * If the current string is null, the method should return an empty string.
     * If n is not a letter (and the current string is not null), the method should return an empty string.
     *
     * Example(s):
     * - For a current string "Hello 90, bye 2", calling filterLetters('h', false) would return "llo 90, y 2"
     * - For a current string "Abcdefg", calling filterLetters('c', false) would return "defg"
     * - For a current string "Hello 90, bye 2", calling filterLetters('h', true) would return "e 90, be 2"
     * - For a current string "Abcdefg", calling filterLetters('c', true) would return "Ab"
     *
     * Remember: This method builds and returns a new string, and does not directly modify the myString field.
     *
     * @param n char to compare to
     * @param more indicates whether letters <= or >= n will be removed
     * @return new string with letters removed
     */
    public String filterLetters(char n, boolean more) {
        // TODO Implement method
        if(this.myString == null || !Character.isLetter(n)){
            return "";
        }
        String onlyBig = "";
        String onlySmall = "";

        for(char mango : this.myString.toCharArray() ){
            if(Character.isLetter(mango)){
                if(mango<n){onlySmall+=mango;}
                else if(mango>n){onlyBig+=mango;}
            }else{
                onlyBig+=mango;
                onlySmall+=mango;
            }
        }
        /*
        String sitro1 = "";
        String sitro2 ="";
        char[] redSofa = this.myString.toCharArray();
        for(char fromRed: redSofa){
            if(Character.isLetter(fromRed)){
                if(fromRed <= n){
                    sitro1+=fromRed;//sitro1 will contain all the characters that are less than n

                }else if(fromRed >= n){

                    sitro2+=fromRed;//sitro2 will contain all the characters that are greater than n
                }
            } else{
                sitro1 += fromRed;
                sitro2 += fromRed;}
        }
        if(more){
            return sitro1;
        }else{
            return sitro2;}*/

        //I need to decide which string to return
        if(more==false){
            return onlyBig;
        }else{
            return onlySmall;
        }
    }
}