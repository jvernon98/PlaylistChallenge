package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        //create an arrayList from the array to utilize the methods
        ArrayList<String> musicSelection = new ArrayList<String>(Arrays.asList(this.playList));
        int forwardCount = Math.abs(musicSelection.indexOf(selection) - startIndex);
        int backwardsCount = Math.abs((musicSelection.size()+ startIndex) -musicSelection.lastIndexOf(selection));
        return Math.min(forwardCount, backwardsCount);
    }}