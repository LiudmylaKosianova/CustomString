package luckytwin;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCustom {
    String myString;
    boolean isSet;

    public StringCustom() {
        this.myString = null;
        this.isSet = false;
    }

    public String getString() {
        if (this.myString != null) {
            return this.myString;
        } else {
            return null;
        }
    }

    public void setString(String string) {
        this.myString = string;
        this.isSet = true;
    }


    public String reverse(String arg) {
        if (Objects.equals(this.myString, "") || this.myString == null) {
            return "";
        }
        if (Objects.equals(arg, "")) {
            return this.myString;
        }

        String newArg = "";
        char[] argArray = arg.toCharArray();
        //loop through the argArray
        for (char i : argArray) {
            if (Character.isLetter(i)) {
                newArg += i;
            }
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
    }
}
