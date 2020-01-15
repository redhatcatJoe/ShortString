package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Short {
    public String shorterLine;
    ArrayList<String> listOfLines = new ArrayList <> ();
    Scanner reader = new Scanner (System.in);


    public void ReadLineAndPutItToList (){
        for (int i =0 ; i < 5; i++) {
            listOfLines.add (reader.nextLine ());

        }
    }

    public void FindShorterLine (){
        shorterLine = listOfLines.get (0);

        for (int i = 0; i < listOfLines.size (); i++) {
            if ( listOfLines.get (i).length ()< shorterLine.length ()){
                shorterLine = listOfLines.get (i);

            }

        }

    }

    public void FindAllShorterLine(){
        for (int i = 0; i < listOfLines.size (); i++) {
            if (shorterLine.length ()==listOfLines.get (i).length ()){
                System.out.println (listOfLines.get (i) );
            }

        }
    }

}
