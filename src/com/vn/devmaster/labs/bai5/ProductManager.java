package com.vn.devmaster.labs.bai5;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author ADMIN
 */
public class ProductManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer, Product> map = new LinkedHashMap();
        ArrayList<Product> arr = new ArrayList();
        System.out.println("Nhap n:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            Product tmp = new Product();
            tmp.nhap();
            map.put(i + 1, tmp);
            arr.add(tmp);
        }
        System.out.println("Thong tin vua nhap la:");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + "." + m.getValue().toString());
        }
        List<Map.Entry<Integer, Product>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> o1.getValue().getYearMaking() - o2.getValue().getYearMaking());

        System.out.println("Danh sach sau khi sap xep theo nam san xuat la:");
        list.forEach(integerProductEntry -> System.out.println(integerProductEntry.getKey()
                + "-" + integerProductEntry.getValue()));
    }
}