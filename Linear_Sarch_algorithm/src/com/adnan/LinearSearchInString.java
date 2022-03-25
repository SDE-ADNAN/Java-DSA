package com.adnan;

public class LinearSearchInString {
    public static void main(String[] args) {
        String name = "ADNAN";
        char target = 'A';
        System.out.println(search(name,target));

    }

    static boolean search(String name, char target) {
        if(name.length()==0){
            return false;
        }
        for (int i = 0; i <name.length() ; i++) {
            char element = name.charAt(i);
            if(element == target){
                return true;
            }


        }
        return false;
    }
}
