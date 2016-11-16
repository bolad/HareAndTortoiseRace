package com.bolad.hareandtortoise;

import com.bolad.hareandtortoise.Contender;


public class Hare extends Contender{
    
    int position;
    
    public void sleep() {
        
    }
    
    public void bigHop() {
        position += 9;
    }
    
    public void bigSlip() {
        
        if ( position > 12){
            position -= 12;
        } else {
            position = 1;
        }
       
    }
    
    public void smallHop() {
        position += 1;
    }
    
    public void smallSlip() {
        
        if ( position > 2){
            position -= 2;
        } else {
            position = 1;
        }
    }
    
}
