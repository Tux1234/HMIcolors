package com.example.power.hmicolors;

/**
 * Created by power on 16.12.2017.
 */

public interface InterfaceResult {

    void set_answers();
    String get_answer(Integer id);
    void update_highscore();
    Integer get_highscore();
    void delete_highscore(ImplResult result);

}
