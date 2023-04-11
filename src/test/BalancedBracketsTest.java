package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void emptyEmptyReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void IsFlippedIsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void includesOtherCharacters(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void includesOtherCharactersAndFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }
}
