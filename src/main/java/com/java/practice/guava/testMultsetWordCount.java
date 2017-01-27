package com.java.practice.guava;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liujw on 2016/9/9.
 */
public class testMultsetWordCount {
    public static void main(String[] args) {
        String strWorld = "wer|dfd|dd|dfd|dd|de|dr";
        String[] words = strWorld.split("\\|");
        List<String> wordList = new ArrayList<String>();
        for(String word: words) {
            wordList.add(word);
        }

        Multiset<String> wordsMultiset = HashMultiset.create();
        wordsMultiset.addAll(wordList);

        for(String key:wordsMultiset.elementSet()) {
            System.out.println(key+" count:"+wordsMultiset.count(key));
        }

        if(!wordsMultiset.contains("peida")) {
            wordsMultiset.add("peida", 2);
        }

        for(String key:wordsMultiset.elementSet()) {
            System.out.println(key+" count:"+wordsMultiset.count(key));
        }
    }
}
