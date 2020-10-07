/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pokemon;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
/**
 *
 * @author Diogo_Ramos
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int cont = 1,
               x = 0,
               y = 0;
       char input; 
       ArrayList<Coord> map= new ArrayList<Coord>();
       map.add(new Coord(x,y));
       
	do
	{
		//System.out.printf("\nEscreva uma das sequintes letras para mover a direcao |N|E|S|O| \n");
                String hello = JOptionPane.showInputDialog("Input a letter: ");
                input = hello.charAt(0);    

		switch (input)
		{
		case 'N':
                        x++;
                        Coord temp= new Coord(x,y);
                       
                        if(map.contains(temp) == false ){
                            cont++;
                            map.add(temp);
                        }
                        System.out.printf(" "+cont+"\n");
			//System.out.printf("Apanhou " + cont + " Pokemons.\n");
                        //System.out.printf("X " + x + " y" + y + "\n");
			break;
		case 'E':
                        y--;
                        Coord temp2= new Coord(x,y);
                        
                        if(map.contains(temp2) == false){
                            cont++;
                            map.add(temp2);
                        }
                        System.out.printf(" "+cont+"\n");
			//System.out.printf("Apanhou " + cont + " Pokemons.\n");
                        //System.out.printf("X " + x + " y" + y + "\n")
			break;
		case 'S':
                        x--;
                        Coord temp3= new Coord(x,y);
                        if(map.contains(temp3) == false){
                            cont++;
                            map.add(temp3);
                        }
                        System.out.printf(" "+cont+"\n");
			//System.out.printf("Apanhou " + cont + " Pokemons.\n");
                        //System.out.printf("X " + x + " y" + y + "\n");
			break;
		case 'O':
                        y++;
                        Coord temp4= new Coord(x,y);
                        if(map.contains(temp4) == false){
                            cont++;
                            map.add(temp4);
                        }
                        System.out.printf(" "+cont+"\n");
			//System.out.printf("Apanhou " + cont + " Pokemons.\n");
                        //System.out.printf("X " + x + " y" + y + "\n");
			break;
		default:
			//System.out.printf("Erro escreva uma letra permitidas |N|E|S|O|, para direcoese C para fechar a aplicacao.");
			break;
		}
	
		
	} while (true);
    }
    
}
