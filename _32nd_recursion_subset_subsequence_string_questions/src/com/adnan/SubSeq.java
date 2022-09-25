package com.adnan;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
    String s = "abc";
     ArrayList<String> ans = subSeqList("",s);
        System.out.println(ans);
    }
    static void subSeq(String p ,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p+ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    // For Returning Array of SubSequences
    static ArrayList<String>  subSeqList(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqList(p+ch, up.substring(1));
        ArrayList<String> right = subSeqList(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
