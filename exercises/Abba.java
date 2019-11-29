/*
Given two strings, a and b, return the result of putting them together in the order abba, e.g. 
"Hi" and "Bye" returns "HiByeByeHi".

makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"
*/

public class Abba{
    public static void main(String[] args) {
        System.out.print(args[0]+args[1]+args[1]+args[0]);
    }
}