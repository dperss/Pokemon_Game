/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pokemon;

/**
 *
 * @author Diogo_Ramos
 */
class Coord {
        int x;
        int y;
        
        
        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        int getx(){
            return x;
        }
        int gety(){
            return y;
        }
        
        @Override
        public boolean equals(Object o){
            if(o instanceof Coord){
                 Coord p = (Coord) o;
                 return (this.x==p.getx() && this.y == p.gety());
            } else
                 return false;
        }
        
    }
