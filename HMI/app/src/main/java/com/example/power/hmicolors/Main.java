package com.example.power.hmicolors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by power on 16.12.2017.
 */

public class Main {
    public static void main(String[] args) {

        String u="testuser"+0;
        List<ImplUser> listUsers = new ArrayList<>();
        ImplTest test = new ImplTest();
        test.set_Test();
        System.out.println("Path to picture: "+test.get_test_pic_path(1));
        test.delete_Test(1);
        System.out.println("Path to picture: "+test.get_test_pic_path(1));

        /*
        ImplUser user = new ImplUser();
        user.add_User(pic_1, "Manuel Kaufmann", 35);
        System.out.println("User: "+user.get_User(pic_1).get_name()+" ("+user.get_User(pic_1).get_age()+")");
        user.update_User(pic_1, "Julia Medvednikova", 27);
        System.out.println("User: "+user.get_User(pic_1).get_name()+" ("+user.get_User(pic_1).get_age()+")");
        user.delete_User(pic_1);
        if(user.get_User(pic_1) != null){
            System.out.println("User: "+user.get_User(pic_1).get_name()+" ("+user.get_User(pic_1).get_age()+")");
        }else{
            System.out.println("User not available");
        }*/

        ImplUser user1 = new ImplUser(1, "Manuel Kaufmann", 35);
        ImplUser user2 = new ImplUser(2, "Julia Medvednikova", 27);
        ImplUser us = new ImplUser(3, "MO", 25);
        listUsers.add(0, user1);
        listUsers.add(1, user2);
        listUsers.add(2, us);
        System.out.println("User: "+listUsers.get(0).get_name());
        System.out.println("User: "+listUsers.get(1).get_name());
        user2.update_User("JM", 30);
        System.out.println("User: "+listUsers.get(1).get_name());

        for(ImplUser users: listUsers){
            System.out.println("User -> "+users.get_name());
        }

        listUsers.removeAll(listUsers);


        ImplResult result1 = new ImplResult();


        result1.update_highscore();

        System.out.println("Highscore: "+result1.get_highscore());


        result1.update_highscore();

        System.out.println("Highscore: "+result1.get_highscore());

    }
}