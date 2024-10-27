package top.zhuchl.cryption.simplexml.core;

public interface Marshaller {
   String marshallText(Object value, Class type) throws Exception;
   Object unmarshallText(String value, Class type) throws Exception;
}