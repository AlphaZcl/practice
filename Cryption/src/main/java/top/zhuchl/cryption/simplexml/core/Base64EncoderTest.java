package top.zhuchl.cryption.simplexml.core;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import junit.framework.TestCase;
import org.simpleframework.xml.core.Base64InputStream;
import org.simpleframework.xml.core.Base64OutputStream;

public class Base64EncoderTest extends TestCase {

   public void testEncodingDataOutput() throws IOException {
      Base64OutputStream encoder = new Base64OutputStream();
      DataOutputStream stream = new DataOutputStream(encoder);
      String text = "Hello World";
      
      stream.writeUTF(text);
      stream.close();
      
      String value = encoder.toString();
      System.err.println(value);
      
      Base64InputStream decoder = new Base64InputStream(value);
      DataInputStream source = new DataInputStream(decoder);
      String result = source.readUTF();
      
      System.err.println(result);
      assertEquals(result, text);
   }
}
