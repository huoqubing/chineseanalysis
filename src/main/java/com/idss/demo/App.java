package com.idss.demo;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.tokenizer.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        //tokenizerUsage();
        nlp();
    }


    public static void tokenizerUsage(){
        String text = "你好，欢迎使用HanLP汉语处理包！";
        System.out.println(String.format("Demo: %s",HanLP.segment(text)));
        System.out.println(String.format("StandardTokenizer: %s",StandardTokenizer.segment(text)));
        System.out.println(String.format("BasicTokenizer: %s", BasicTokenizer.segment(text)));
        System.out.println(String.format("IndexTokenizer: %s", IndexTokenizer.segment(text)));
        System.out.println(String.format("NLPTokenizer: %s", NLPTokenizer.segment(text)));
        System.out.println(String.format("NotionalTokenizer: %s", NotionalTokenizer.segment(text)));
        System.out.println(String.format("SpeedTokenizer: %s", SpeedTokenizer.segment(text)));
        System.out.println(String.format("TraditionalChineseTokenizer: %s", TraditionalChineseTokenizer.segment(text)));
        System.out.println(String.format("URLTokenizer: %s", URLTokenizer.segment(text)));

    }

    public static void nlp(){
        System.out.println(NLPTokenizer.segment("我新造一个词叫幻想乡你能识别并标注正确词性吗？"));
        System.out.println(NLPTokenizer.segment("我的希望是希望张晚霞的背影被晚霞映红"));
    }
}
