package com.albert.song.web.Utils;

import com.albert.song.web.entity.ToKenSettings;

/**
 * @author Song n
 * @create 2020-03-29 17:52
 */
public class JwtTokenUtil {

    private static String secretKey;

    private static String issuer;

    public static void setTokenSettings(ToKenSettings tokenSettings){
        secretKey = tokenSettings.getSecretKey();
        issuer = tokenSettings.getIssuer();
    }

    public static String getToken(){
        return secretKey + issuer;
    }
}
