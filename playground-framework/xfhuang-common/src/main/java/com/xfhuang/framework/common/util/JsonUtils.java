package com.xfhuang.framework.common.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.SneakyThrows;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class JsonUtils {

    private static ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    static {
        OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        OBJECT_MAPPER.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        OBJECT_MAPPER.registerModules(new JavaTimeModule()); // 解决 LocalDateTime 的序列化问题
    }


    public static void init(ObjectMapper objectMapper) {
        OBJECT_MAPPER = objectMapper;
    }


    @SneakyThrows
    public static String toJsonString(Object obj) {
       return OBJECT_MAPPER.writeValueAsString(obj);
    }


    @SneakyThrows
    public static <T> T parseObject(String jsonStr, Class<T> clazz) {
        if (StringUtils.isBlank(jsonStr)) {
            return null;
        }

        return OBJECT_MAPPER.readValue(jsonStr, clazz);
    }


    public static <K, V> Map<K, V> parseMap(String jsonStr, Class<K> keyClass, Class<V> valueClass) throws Exception {
        // 创建 TypeReference，指定泛型类型
        TypeReference<Map<K, V>> typeRef = new TypeReference<Map<K, V>>() {
        };

        // 将 JSON 字符串转换为 Map
        return OBJECT_MAPPER.readValue(jsonStr, OBJECT_MAPPER.getTypeFactory().constructMapType(Map.class, keyClass, valueClass));
    }


    public static <T> List<T> parseList(String jsonStr, Class<T> clazz) throws Exception {
        // 使用 TypeReference 指定 List<T> 的泛型类型
        return OBJECT_MAPPER.readValue(jsonStr, new TypeReference<List<T>>() {
            @Override
            public CollectionType getType() {
                return OBJECT_MAPPER.getTypeFactory().constructCollectionType(List.class, clazz);
            }
        });
    }


    public static <T> Set<T> parseSet(String jsonStr, Class<T> clazz) throws Exception {
        // 使用 TypeReference 指定 Set<T> 的泛型类型
        return OBJECT_MAPPER.readValue(jsonStr, new TypeReference<>() {
            @Override
            public CollectionType getType() {
                return OBJECT_MAPPER.getTypeFactory().constructCollectionType(Set.class, clazz);
            }
        });
    }

}
