package com.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class ReverseTest {
    @Autowired
    Reverse Reverse;

    @Test
    // Testfunctie van woorden die omgedraaid worden
   public void testReverse() {
        String Message = Reverse.omdraaien("Nigel");
        Assert.assertEquals("legiN", Message);

    }


}