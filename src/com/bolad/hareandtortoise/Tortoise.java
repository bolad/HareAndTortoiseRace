package com.bolad.hareandtortoise;

import com.bolad.hareandtortoise.Contender;

public class Tortoise extends Contender {
    
    
    public void fastPlod() {
            position += 3;
    }
    
    public void slip() {
        if ( position > 6){
            position -= 6;
        } else {
            position = 1;
        }
    }
    
    public void slowPlod() {
        position += 1;
    }
}
