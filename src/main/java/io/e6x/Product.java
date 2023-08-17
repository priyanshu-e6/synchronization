package io.e6x;

import java.time.LocalTime;

public class Product {
    char name;
    int ID;
    LocalTime timestamp;
    public Product(char name, int ID, LocalTime timestamp){
        this.name = name;
        this.ID= ID;
        this.timestamp = timestamp;
    }


}
