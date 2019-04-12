package com.fantastic.designpattern.factorypattern.simplefactory;

import java.io.IOException;
import java.util.Properties;

/**
 * @ClassName ConfigUtil
 * @Description TODO
 * @Author lwq
 * @Date 4/12/2019 10:12 AM
 * @Version 1.0
 */
public class ConfigUtil {

    private static Properties properties =  new Properties();

    static {
        loadFile();
    }

    private static void loadFile() {
        try {
            properties.load(ConfigUtil.class.getClassLoader().getResourceAsStream("kv.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getValueByKey(  String key){
       return properties.getProperty(key);
    }


}
