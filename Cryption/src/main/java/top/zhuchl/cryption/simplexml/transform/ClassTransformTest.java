package top.zhuchl.cryption.simplexml.transform;

import java.util.Date;

import junit.framework.TestCase;
import org.simpleframework.xml.transform.ClassTransform;

public class ClassTransformTest extends TestCase {
   
   public void testClassTransform() throws Exception {
      Class c = Date.class;
      ClassTransform transform = new ClassTransform();
      String value = transform.write(c);
      Class copy = transform.read(value);
      
      assertEquals(c, copy);      
   }
}

