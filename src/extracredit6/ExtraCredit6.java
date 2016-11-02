/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extracredit6;

/**
 *
 * @author Robyn
 */
import java.util.*;
import java.util.Random;

public class ExtraCredit6 {

    /**
     * @param args the command line arguments
     */   

    public static void main(String[] args) {
//initialize 2 names
//create two object
Scanner a=new Scanner(System.in);
Extra people1=new Extra("Suzanne Vezine");
Extra people2=new Extra("Robyn Greene");
Extra people3=new Extra("Cornith Kearney");


    
 System.out.printf("These people are: %s%n",people1.getName ());
 System.out.printf("These people are: %s%n",people2.getName ());       
  System.out.printf("These people are: %s%n",people3.getName ());      
    }//main

}//class
