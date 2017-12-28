package com.example.power.hmicolors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by power on 16.12.2017.
 */

public class ImplResult implements InterfaceResult {

    private List<Boolean> listResult = new ArrayList<>();
    private List<String> listCorrectAnswer = new ArrayList<>();
    private Integer highscore = 0;

    @Override
    public void set_answers(){
        listCorrectAnswer.add(0,"radioButton1");
        listCorrectAnswer.add(1,"radioButton2");
        listCorrectAnswer.add(2,"radioButton3");
        listCorrectAnswer.add(3,"radioButton3");
        listCorrectAnswer.add(4,"radioButton3");
        listCorrectAnswer.add(5,"radioButton3");
        listCorrectAnswer.add(6,"radioButton3");
        listCorrectAnswer.add(7,"radioButton3");
        listCorrectAnswer.add(8,"radioButton3");
        listCorrectAnswer.add(9,"radioButton3");
    }

    @Override
    public String get_answer(Integer id) { return listCorrectAnswer.get(id); }

    @Override
    public void update_highscore() {
        highscore = 0;
        for(Boolean r : listResult){
            if(r.equals(true)){
                highscore++;
            }
        }
    }

    @Override
    public Integer get_highscore() {
        return highscore;
    }


    @Override
    public void delete_highscore(ImplResult result) {

    }
}
