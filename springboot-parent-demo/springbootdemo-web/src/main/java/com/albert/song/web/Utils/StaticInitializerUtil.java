package com.albert.song.web.Utils;

import com.albert.song.web.entity.ToKenSettings;
import org.springframework.stereotype.Component;

/**
 * @author Song n
 * @create 2020-03-29 17:56
 */
@Component
public class StaticInitializerUtil {

    private ToKenSettings toKenSettings;
    public StaticInitializerUtil(ToKenSettings toKenSettings){
        JwtTokenUtil.setTokenSettings(toKenSettings);
    }
}
