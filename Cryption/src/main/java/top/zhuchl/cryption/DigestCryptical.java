package top.zhuchl.cryption;

import top.zhuchl.cryption.codescheme.CodingScheme;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 对目标数据进行摘要计算
 *
 * @Author AlphaZcl
 * @Date 2022/1/13
 **/
public class DigestCryptical {

    /**
     * 编码方案
     */
    private CodingScheme codingScheme;

    /**
     * 摘要计算算法名称
     */
    private String algorithm;

    /**
     * 摘要计算
     *
     * @param plain       摘要明文
     * @param charsetName 摘要字符集编码
     * @return
     * @throws IOException
     */
    public String calculateDigest(String plain, String charsetName) throws IOException {
        return calculateDigest(plain.getBytes(charsetName));
    }

    /**
     * 摘要计算
     *
     * @param bytes 摘要明文字节数组
     * @return
     */
    public String calculateDigest(byte[] bytes) {
        String cryptic = null;
        try {
            MessageDigest instance = MessageDigest.getInstance(algorithm);
            byte[] digest = instance.digest(bytes);
            cryptic = codingScheme.doDecode(digest);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return cryptic;
    }

    /**
     * 文件内容摘要计算
     *
     * @param file 目标文件
     * @return
     */
    public String calculateDigest(File file) {
        String cryptic = null;
        try (FileInputStream fis = new FileInputStream(file);
             ByteArrayOutputStream baos = new ByteArrayOutputStream((int)file.length())) {
            BufferedInputStream bis = new BufferedInputStream(fis);
            int buffer_size=2048;
            byte[] buffer = new byte[buffer_size];
            int len = 0;
            while((len=bis.read(buffer))!=-1){
                baos.write(buffer,0,len);
                baos.flush();
            }
            cryptic = calculateDigest(baos.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return cryptic;
    }


}
