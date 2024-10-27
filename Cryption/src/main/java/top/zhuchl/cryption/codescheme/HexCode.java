package top.zhuchl.cryption.codescheme;

import java.util.stream.Stream;

/**
 * @Author AlphaZcl
 * @Date 2022/1/14
 **/
public class HexCode implements CodingScheme{
    @Override
    public String doDecode(byte[] digest) {
        StringBuilder builder = new StringBuilder();
        Stream.of(digest).forEach();
        return null;
    }
}
