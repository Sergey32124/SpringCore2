package com.example.springcore2.emity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Auto {
    private int id;
    private Engine engine;
    private String  model;
}
