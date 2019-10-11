package com.ouyeel.util;




import net.sf.json.JSONArray;

import java.io.IOException;
import java.util.*;

/**
 * @Author：sks
 * @Description：
 * @Date：Created in 16:18 2017/12/18
 * @Modified by：
 **/
public class JsontoMap {

    public static Map<String, Object> getMap(String json) {
        JSONArray jsonArray = JSONArray.fromObject(json);
        Map<String, Object> valueMap = new HashMap<String, Object>();
        return valueMap;
    }

    public static void main(String[] args) {
        Map<String, Object> map = getMap("");

        System.out.println(map.size());
    }
}