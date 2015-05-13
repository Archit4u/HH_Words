package com.archit.abcflip;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by vaio on 13-05-2015.
 */
public class Different_colors {
    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };
    public int mAlphabetcolor()
    {

        String str="";
        Random randomgenerator=new Random();
        int gen=randomgenerator.nextInt(mColors.length);

        str=mColors[gen];
        int color= Color.parseColor(str);
        return color;
    }
}

