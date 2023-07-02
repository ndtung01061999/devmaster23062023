package com.vn.devmaster.demo.anonymousornested;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Nested {
    private Girl girl = new Girl();

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    class Girl {
        private String name;

        void display() {
            System.out.println("Ha");
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.getGirl().display();
    }
}
