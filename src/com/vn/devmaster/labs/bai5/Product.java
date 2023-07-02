package com.vn.devmaster.labs.bai5;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;


class Product {
    private String proId;
    private String proName;
    private String producer;
    private int yearMaking;
    private float price;

    public Product() {

    }

    public Product(String proId, String proName, String producer, int yearMaking, float price) {
        this.proId = proId;
        this.proName = proName;
        this.producer = producer;
        this.yearMaking = yearMaking;
        this.price = price;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap proId:");
        proId = sc.nextLine();
        System.out.println("Nhap proName:");
        proName = sc.nextLine();
        System.out.println("Nhap san xuat:");
        producer = sc.nextLine();
        System.out.println("Nhap nam san suat:");
        yearMaking = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap gia:");
        price = Float.parseFloat(sc.nextLine());
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearMaking() {
        return yearMaking;
    }

    public void setYearMaking(int yearMaking) {
        this.yearMaking = yearMaking;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "proId=" + proId + ", proName=" + proName + ", producer=" + producer + ", yearMaking=" + yearMaking + ", price=" + price + '}';
    }

}