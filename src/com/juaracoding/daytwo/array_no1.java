package com.juaracoding.daytwo;

import java.util.ArrayList;

public class array_no1 {
    public static void main(String[] args) {
        ArrayList<String> sihanip = new ArrayList<>();
        sihanip.add("hanip");
        sihanip.add("ganteng");
        sihanip.add("banget");
        System.out.println(sihanip);
        System.out.println("Get:" + sihanip.get(2));
        sihanip.set(1,"hanip");
        System.out.println(sihanip);
        System.out.println(sihanip.size());
        sihanip.remove(2);
        System.out.println("Remove: "+sihanip);
        sihanip.clear();
        System.out.println("Clear: "+sihanip);
    }
}
