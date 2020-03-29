package com.albert.song.web.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Song n
 * @create 2020-03-29 17:48
 */
@Component
@ConfigurationProperties(prefix = "jwt")
public class ToKenSettings {
    private String secretKey;
    private String issuer;

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    @Override
    public String toString() {
        return "ToKenSettings{" +
                "secretKey='" + secretKey + '\'' +
                ", issuer='" + issuer + '\'' +
                '}';
    }
}
