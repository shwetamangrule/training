package training.testing;


import org.junit.Test;
import static org.junit.Assert.*;

public class TestReorganizingString {

	
	    @Test
	    public void testMain() {
	        String[] expected = new String[]{
	            "aba" }; 
	        String[] results = 
	            AbstractMainTests.executeMain("ReorganizingString" new String[]{"Yeah"});

	        assertArrayEquals(expected, results);
	    }
	}

