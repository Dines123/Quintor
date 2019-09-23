package com.example.demo;

import org.springframework.stereotype.Component;



@Component
class WoordenTellen{

    int WordCount(String input){

        return input.split("\\w+").length ;
    }

}

