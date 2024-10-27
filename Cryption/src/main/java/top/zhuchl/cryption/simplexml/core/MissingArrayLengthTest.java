package top.zhuchl.cryption.simplexml.core;

import junit.framework.TestCase;

import org.simpleframework.xml.ElementArray;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.core.ElementException;
import org.simpleframework.xml.core.Persister;

public class MissingArrayLengthTest extends TestCase {
    
    private static final String SOURCE = 
    "<missingArrayLengthExample>"+
    " <array>"+
    "   <item>one</item>" +
    "   <item>two</item>" +
    "   <item>three</item>" +
    " </array>"+
    "</missingArrayLengthExample>";
    
    @Root
    private static class MissingArrayLengthExample {
        
        @ElementArray(entry="item")
        private String[] array;
    }
    
    public void testMissingArrayLength() throws Exception {
        Persister persister = new Persister();
        boolean exception = false;
        
        try {
            MissingArrayLengthExample value = persister.read(MissingArrayLengthExample.class, SOURCE);
        } catch(ElementException e) {
            exception = true;
        }
        assertTrue("Exception not thrown", exception);
    }
}
