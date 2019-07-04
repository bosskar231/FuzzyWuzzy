package com.auxo;

import me.xdrop.fuzzywuzzy.FuzzySearch;

import java.util.ArrayList;
import java.util.List;
import me.xdrop.fuzzywuzzy.model.ExtractedResult;
public class FuzzyWuzzy {

    public String findClosest(String first, List<String> list)
    {

        List<ExtractedResult> lisr= new ArrayList<ExtractedResult>();
        lisr=FuzzySearch.extractTop(first,list,86);
        ExtractedResult extractedResult=lisr.get(0);
       // System.out.println("The perfecte matching ");


//        extractedResult.;
//        System.out.println(lisr.get(0));
//        System.out.println( FuzzySearch.extractTop(first,list,86));

        String result="the String "+extractedResult.getString()+" score "+extractedResult.getScore() ;




        return result;

    }


    public  boolean compare(String first,String second,int threshold)
    {
        return threshold <= FuzzySearch.ratio(first, second);
    }

    public static void main(String[] args) {
        FuzzyWuzzy fuzzyWuzzy=new FuzzyWuzzy();
        //System.out.println(fuzzyWuzzy.compare("h","hell",85));
        List<String> list=new ArrayList<String>();
        list.add("hai this is bas");
        list.add("hi this is bas");
        list.add("hai tis is bas");
        list.add("hai this is bask");
        list.add("hai this is b");
        list.add("hai this  bas");
        list.add("hai is bas");

        System.out.println(fuzzyWuzzy.findClosest("hai this is baskar",list));
    }
}
