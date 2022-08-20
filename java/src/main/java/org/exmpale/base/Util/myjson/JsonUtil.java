package org.exmpale.base.Util.myjson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @author hzhq1255
 * @date 2022/2/2 21:14
 */
public class JsonUtil {


    public static String toJsonString(Object o){
        String result = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            result = objectMapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }
}
