package com.common.program.core;

import java.util.HashMap;

public class ArrayTesting {
	
	public static void main(String a[]){
        HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIR");
        hm.put("second", "FIR");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        if(hm.containsValue("FIR")){
            System.out.println("The hashmap contains value SECOND INSERTED");
        } else {
            System.out.println("The hashmap does not contains value SECOND INSERTED");
        }
        if(hm.containsValue("first")){
            System.out.println("The hashmap contains value first");
        } else {
            System.out.println("The hashmap does not contains value first");
        }
    }

}
