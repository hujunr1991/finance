package com.imooc.util;

import com.imooc.java.RSAUtil;
import org.junit.Test;

public class RSAUtilTest {
    public static String publickey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnqYV8qLTm7VEmmaDzeinWC+DY\n" +
            "V5bP7r2IbhS4EM8x/WMtzzYReCke4On+Z/FAXZwsnyUfAZxeRXkL3Okjwf/f91kW\n" +
            "4IK0PgTLxNMxAHdjQSNAOdR7Uac6dYnDkcj0pG2tfySCHKz009THjOfPdvrOc70g\n" +
            "h18RxfbIDhD73vW53QIDAQAB";

    public static String privatekey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAKephXyotObtUSaZ\n" +
            "oPN6KdYL4NhXls/uvYhuFLgQzzH9Yy3PNhF4KR7g6f5n8UBdnCyfJR8BnF5FeQvc\n" +
            "6SPB/9/3WRbggrQ+BMvE0zEAd2NBI0A51HtRpzp1icORyPSkba1/JIIcrPTT1MeM\n" +
            "5892+s5zvSCHXxHF9sgOEPve9bndAgMBAAECgYAxsdRoA5VDETpJZ6XGJQJ7eB/X\n" +
            "3/ZKgWfaJU6s1AaluYYJEO7ktKnzhhS1HFfsjRJ6Q118WDzh0FO1iW/s8laFr8QX\n" +
            "kno97ltNTEQbpfZZJTDUVgtjS6LV/Y3+Y7FUDU8XGUwg9v5bXkmudhVc92zB9Sdp\n" +
            "xOfM3oD55bxLIYv6AQJBANuXmyywrgIAZ1KfidYIC+qOuBjtA1NGpT4n/ef5oYYX\n" +
            "cz7fdKRRKWaT6MDDc8lW6f9v8K7Sr1wklqfIMzBpyl0CQQDDdcrY6+OeaF87osPv\n" +
            "MiMQSMkkRLfU96uuYzWYhdsQRegddhZ7n2koDOVj1VmZS65Xymnry5SHWATzcOA4\n" +
            "r7WBAkAo1MXbx3ZzlNOhf1zH2XMtyB/fMqL9pxMuvYzux3ILVuzs8evkadsC4dnT\n" +
            "jgRHmcuk3ZGpUC+fOIZy6DzscZ9ZAkApz5Gzs0n+ga8Vb6zgBuaPPjKgqn50dQJp\n" +
            "jFlTphaFNZ8AZllK2n/BDHkpUOMYsqK5rtfXk7XS+dYdSSD9n0CBAkEAnmHyIln2\n" +
            "qMrzosBFeB/ZS3Opcmztf7zFquCNl8vD65Qw1hari16pVhnbUT9vRIStGu7js9W0\n" +
            "6ByHicvWTGw51A==";

    @Test
    public void signTest() {
        String text = "imooc";
        String sign = RSAUtil.sign(text,privatekey);
        System.out.println(sign);
        System.out.println(RSAUtil.verify(text,sign,publickey));
    }

}
