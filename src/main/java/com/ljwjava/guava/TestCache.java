package com.ljwjava.guava;

import com.google.common.cache.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by liujw on 2016/9/8.
 */
public class TestCache {
    public static <K, V> LoadingCache<K, V> cached(CacheLoader<K, V> cacheLoader) {
        LoadingCache<K, V> cache = CacheBuilder
                .newBuilder()
                .maximumSize(2)
                .weakKeys()
                .softValues()
                .refreshAfterWrite(120, TimeUnit.SECONDS)
                .expireAfterWrite(10, TimeUnit.MINUTES)
                .removalListener(new RemovalListener<K, V>() {
                    @Override
                    public void onRemoval(RemovalNotification<K, V> notification) {
                        System.out.println(notification.getKey()+"被移除");

                    }}).build(cacheLoader);
        return cache;
    }

    public static LoadingCache<String, String> commonCache(final String key) throws Exception {
        LoadingCache<String, String> commonCache = cached(new CacheLoader<String, String>() {
            @Override
            public String load(String key) throws Exception {
                return "hello "+key+"!";
            }
        });
        return commonCache;
    }

    public static void main(String[] args) throws Exception {
        LoadingCache<String, String> commonCache = commonCache("peida");
        System.out.println("peida:"+commonCache.get("peida"));
        commonCache.apply("harry");
        System.out.println("harry:"+commonCache.get("harry"));
        commonCache.apply("lisa");
        System.out.println("lisa:"+commonCache.get("lisa"));
    }
}
