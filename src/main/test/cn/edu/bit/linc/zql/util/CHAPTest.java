package cn.edu.bit.linc.zql.util;

import junit.framework.TestCase;

import static cn.edu.bit.linc.zql.util.CHAP.SHA1;
import static cn.edu.bit.linc.zql.util.CHAP.calcToken;
import static cn.edu.bit.linc.zql.util.CHAP.checkToken;

public class CHAPTest extends TestCase {

    public void testCheckToken() throws Exception {
        // 密码正确
        String password = "12345";
        String scramble = "12345678901234567890";
        String realPassword = SHA1(SHA1("12345"));
        String token = calcToken(password, scramble);
        assertTrue(checkToken(realPassword, scramble, token));

        // 密码错误
        realPassword = SHA1(SHA1("123456"));
        token = calcToken(password, scramble);
        assertFalse(checkToken(realPassword, scramble, token));

        // 密码正确
        password = "root";
        scramble = "12345678901234567890";
        token = calcToken(password, scramble);
        realPassword = SHA1(SHA1("root"));
        assertTrue(checkToken(realPassword, scramble, token));
    }
}