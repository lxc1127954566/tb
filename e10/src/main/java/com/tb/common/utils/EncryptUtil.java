package com.tb.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptUtil {

    private final static Logger log = LoggerFactory.getLogger(EncryptUtil.class);

    /**
     * 方法加密
     *
     * @param str 要加密的字符串
     * @return 加密后的字符串
     */
    public static String getEncrypt(String str, String encName){
        MessageDigest messageDigest = null;
        String encodeStr = null;
        try {
            if (encName == null || encName.equals("")) {
                encName = "MD5";
            }
            messageDigest = MessageDigest.getInstance(encName);
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            encodeStr = byte2Hex(messageDigest.digest());
        } catch (NoSuchAlgorithmException e){
            log.info("异常【{}】",e.getMessage());
        }
        return encodeStr;
    }

    /**
     * sha256加密 将byte转为16进制
     *
     * @param bytes 字节码
     * @return 加密后的字符串
     */
    private static String byte2Hex(byte[] bytes){
        StringBuilder stringBuilder = new StringBuilder();
        String temp;
        for (byte aByte : bytes){
            temp = Integer.toHexString(aByte & 0xFF);
            if (temp.length() == 1){
                stringBuilder.append("0");
            }
            stringBuilder.append(temp);
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        String str = getEncrypt("字符串", "MD5");
        System.out.println(str);
    }
}
