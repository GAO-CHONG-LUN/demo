package com.example.demo;

import com.example.demo.CompactDisc;
import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
    private String title = "sgt.Pepper's Lonely Hearts Club Band";
    private  String artist = "The Beatles";
    @Override
    public void play() {
        System.out.println("Playing "+title +"by "+ artist);

    }
}
