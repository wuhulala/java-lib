package com.wuhulala.util;

import com.alibaba.fastjson.JSON;

/**
 * 0_0 o^o
 *
 * @author wuhulala<br>
 * @date 2018/11/6<br>
 * @description o_o<br>
 * @since v1.0<br>
 */
public class JsonUtils {

    public static<T> T parseJson(String jsonStr, Class<T> clazz){
        return JSON.parseObject(jsonStr, clazz);
    }

    public static String toJson(Object o){
        return JSON.toJSONString(o);
    }

    static class Foo {
        String bar;

        public Foo() {
        }

        public Foo(String bar) {
            this.bar = bar;
        }

        public String getBar() {
            return bar;
        }

        public void setBar(String bar) {
            this.bar = bar;
        }
    }

    public static void main(String[] args) {
        String json = toJson(new Foo("wqeqwe"));
        System.out.println(parseJson(json, Foo.class).bar);
    }

}
