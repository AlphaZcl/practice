package top.zhuchl.cryption.codescheme;

/**
 * 策略方式：根据需求进行不同的编码，包含base64编码及hex16进制编码
 *
 * @Author AlphaZcl
 * @Date 2022/1/13
 **/
public interface CodingScheme {

    /**
     * 对字符串进行编码
     * @param digest 待转码字节
     * @return
     */
    String doDecode(byte[] digest);
}
