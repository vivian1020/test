package com.ljwjava.guava;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;

/**
 * Created by liujw on 2016/9/7.
 * cacheLoader方式创建本地cache
 */
public class TestLoadingCache {
    public static void main(String[] args) throws ExecutionException {
        LoadingCache<String, String> cacheBuilder = CacheBuilder
                .newBuilder().build(new CacheLoader<String, String>() {
                    @Override
                    public String load(String key) throws Exception {
                        String strProValue = "hello "+key+"!";
                        return strProValue;
                    }
                });
        System.out.println("jerry value:"+cacheBuilder.apply("jerry"));
        System.out.println("jerry value:"+cacheBuilder.get("jerry"));
        System.out.println("peida value:"+cacheBuilder.get("peida"));
        System.out.println("peida value:"+cacheBuilder.apply("peida"));
        System.out.println("lisa value:"+cacheBuilder.apply("lisa"));
        cacheBuilder.put("harry", "ssdded");
        System.out.println("harry value:"+cacheBuilder.get("harry"));
    }
}
