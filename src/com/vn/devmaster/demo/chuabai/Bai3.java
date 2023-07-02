package com.vn.devmaster.demo.chuabai;

import java.util.*;
import java.util.stream.Collectors;


/**
 * @author ADMIN
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao n quoc gia:");
        int n = sc.nextInt();
        sc.nextLine();
        Map<Integer, String> map2 = new LinkedHashMap();
        ArrayList<String> arr = new ArrayList();
        for (int i = 1; i <= n; i++) {
            String tp = sc.nextLine();
            map2.put(i, tp);
            arr.add(tp);
        }
        System.out.println("Danh sach quoc gia vua nhap la:");
        for (Map.Entry<Integer, String> m : map2.entrySet()) {
            System.out.println(m.getKey() + "." + m.getValue());
        }
        System.out.println("Danh sach quoc gia sau khi sap xep la:");
        List<Map.Entry<Integer, String>> map3 = new ArrayList<>(map2.entrySet());
        map3.sort((o1, o2) -> o1.getValue().compareTo(o2.getValue()));
        for (Map.Entry<Integer, String> entry : map3) {
            System.out.println(entry.getKey() + "." + entry.getValue());
        }
//        List<Map.Entry<Integer, String>> map3 = map2
//                .entrySet()
//                .stream()
//                .sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue()))
//                .collect(Collectors.toList());
//        map3.forEach(o -> System.out.println(o.getKey() + "." + o.getValue()));

    }
}
