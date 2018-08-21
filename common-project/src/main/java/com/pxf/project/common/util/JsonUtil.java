package com.pxf.project.common.util;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Type;
import java.util.List;

public class JsonUtil {


    private static Logger logger = LoggerFactory.getLogger(JsonUtil.class);
    private static Gson gson   = new Gson();

    /**
     * obj to json
     * 
     * @param obj
     * @return
     */
    public static String toJsonString(Object obj) {
        try {
            return gson.toJson(obj);
        } catch (Exception e) {
            logger.error("{} to json error", obj.getClass(), e);
            return null;
        }
    }

    /**
     * json to obj
     * 
     * @param json
     * @param clazz
     * @return
     */
    public static <T> T parser(String json, Class<T> clazz) {
        try {
            return gson.fromJson(json, clazz);
        } catch (Exception e) {
            logger.error("json to {} error", clazz, e);
            return null;
        }
    }

    /**
     * 转换list
     * 
     * @param json
     * @param typeOfT Type typeOfT = new TypeToken<Collection<Foo>>(){}.getType();
     * @return
     */
    public static <T> List<T> parseList(String json, Type typeOfT) {
        try {
            return gson.fromJson(json, typeOfT);
        } catch (Exception e) {
            logger.error("parse json error : {}", json, e);
            return null;
        }

    }

    

}
