package com.kea.ooprecapinterfaces;
import java.util.ArrayList;

/*
kvadrat skal give 15 i kolonner, rækker og på skrå
tallene 1 - 9 placeres i felterne

Felternes index i arraylisten
+-+-+-+
|0|1|2|
+-+-+-+
|3|4|5|
+-+-+-+
|6|7|8|
+-+-+-+
*/

public class Main {

    public static void main(String[] args) {
	    // initier lister og kald rekursivt

        //startList er alle tal, der skal bruges
        ArrayList<Integer> startList = new ArrayList<Integer>();
        for (int i=0;i<9;i++) startList.add(i+1);
        //byggeList rummer kvadraterne, der laves ud fra listen af tal
        ArrayList<Integer> byggeList = new ArrayList<Integer>();
        //System.out.println(startList);
        //System.out.println(byggeList);

        //kald med fuld liste af tal og tom byggeliste
        kvadrat(startList, byggeList);

        /*
        //kontrol med kendt kvadrat - skal resultere i udskrift af kvadrat
        ArrayList<Integer> kontrolList = new ArrayList<Integer>();
        kontrolList.add(8);
        kontrolList.add(3);
        kontrolList.add(4);
        kontrolList.add(1);
        kontrolList.add(5);
        kontrolList.add(9);
        kontrolList.add(6);
        kontrolList.add(7);
        kontrolList.add(2);
        isMagic(kontrolList);
        */
    }

    public static void kvadrat(ArrayList<Integer> restList, ArrayList<Integer> byggeList)
    {
        if (restList.size()==0)
        {
            //ikke flere tal at bruge, så test om det er et kvadrat
            isMagic(byggeList);
        }
        else
        {
            //prøv alle muligheder for tal i restliste en ad gangen
            for (int i = 0; i < restList.size(); i++) {
                //ny byggeliste skal tilføjes alle elementer fra byggeliste -- ret
                ArrayList<Integer> nyByggeList = new ArrayList<Integer>();
                for (int j=0;j<byggeList.size();j++)
                {
                    nyByggeList.add(byggeList.get(j));
                }
                //nyRestlist til tal, der ikke bliver brugt
                ArrayList<Integer> nyRestList = new ArrayList<Integer>();
                for (int j = 0; j < restList.size(); j++) {
                    if (j == i) {
                        //element i tilføjes kvadratet, der bygges
                        nyByggeList.add(restList.get(i));
                    } else {
                        //resten af listen lægges i nyRestList
                        nyRestList.add(restList.get(j));
                    }
                }
                //kald kvadrat med nye lister
                kvadrat(nyRestList, nyByggeList);
            }
        }
    }

    public static void isMagic(ArrayList<Integer> liste)
    {
        //check om en af summerne vandret, lodret eller diagonalt ikke er korrekt
        boolean magic = true;
        if (liste.get(0) + liste.get(4) + liste.get(8) != 15) magic = false; // --ret
        if (liste.get(2) + liste.get(4) + liste.get(6) != 15) magic = false;
        if (liste.get(0) + liste.get(1) + liste.get(2) != 15) magic = false;
        if (liste.get(3) + liste.get(4) + liste.get(5) != 15) magic = false;
        if (liste.get(6) + liste.get(7) + liste.get(8) != 15) magic = false;
        if (liste.get(0) + liste.get(3) + liste.get(6) != 15) magic = false;
        if (liste.get(1) + liste.get(4) + liste.get(7) != 15) magic = false;
        if (liste.get(2) + liste.get(5) + liste.get(8) != 15) magic = false;
        if (magic) printKvadrat(liste);
    }

    public static void printKvadrat(ArrayList<Integer> liste)
    {
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(liste.get(i+3*j));
            }
            System.out.println();
        }
        System.out.println();
    }
}
