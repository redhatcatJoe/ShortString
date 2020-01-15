package com.company;

public class Main {

    public static void main(String[] args) {
	Short shorter =new Short ();
	shorter.ReadLineAndPutItToList ();  //читает ввод
	shorter.FindShorterLine ();         //находит самую короткую строку
	shorter.FindAllShorterLine ();      //находит строки равные самой короткой и выводит их
    }
}
