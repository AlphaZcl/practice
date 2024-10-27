package top.zhuchl.cryption.codescheme;

/**
 * 进行base64计算
 *
 * @Author AlphaZcl
 * @Date 2022/1/14
 **/
public class Base64Code implements CodingScheme{
    @Override
    public String doDecode(byte[] plain) {
        return new Base64Code().doDecode(plain);
    }
}
