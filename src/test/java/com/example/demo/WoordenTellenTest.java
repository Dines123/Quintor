package com.example.demo;

import org.junit.Assert;

import org.junit.jupiter.api.Test;

public class WoordenTellenTest {
    WoordenTellen WoordenTellen;
    WoordenTellenTest(WoordenTellen WoordenTellen) {
        this.WoordenTellen = WoordenTellen;
    }

    @Test
    public void TestWordCount() {

        Assert.assertEquals(5, WoordenTellen.WordCount("een twee drie vier vijf"));
    }

}