package com.kea.ooprecapinterfaces;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// initier liste og kald
        int[] startList = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(startList));
        kvadrat(startList);
    }

    public static void kvadrat(int[] liste)
    {
        //prøv alle muligheder for starttal en ad gangen
        for (int i=0;i<9;i++)
        {

        }


    }

    public static boolean isMagic(int[] liste)
    {
        boolean magic = true;
        if (liste[0] + liste[4] + liste[9] != 15) magic = false;
        if (liste[2] + liste[4] + liste[7] != 15) magic = false;
        if (liste[0] + liste[1] + liste[2] != 15) magic = false;
        if (liste[3] + liste[4] + liste[5] != 15) magic = false;
        if (liste[6] + liste[7] + liste[8] != 15) magic = false;
        if (liste[0] + liste[3] + liste[6] != 15) magic = false;
        if (liste[1] + liste[4] + liste[7] != 15) magic = false;
        if (liste[2] + liste[5] + liste[8] != 15) magic = false;
        return magic;
    }

}
