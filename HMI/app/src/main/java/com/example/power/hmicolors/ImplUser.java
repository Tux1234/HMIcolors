package com.example.power.hmicolors;

/**
 * Created by power on 19.12.2017.
 */

public class ImplUser implements InterfaceUsers {
    private Integer id = null;



    private String name = null;
    private Integer age = null;


    ImplUser(Integer id, String name, Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public void update_User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String get_name() {
        return this.name;
    }

    @Override
    public Integer get_age() {
        return this.age;
    }

    @Override
    public Integer get_id() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
