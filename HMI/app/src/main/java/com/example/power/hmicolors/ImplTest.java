package com.example.power.hmicolors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by power on 16.12.2017.
 */

public class ImplTest implements InterfaceTest {

    private List<String> listTests = new ArrayList<>();
    private String name = null;
    private Integer id = null;
    private String path = null;
    @Override
    public void set_Test() {
        listTests.add(0, "pic_01");
        listTests.add(1, "pic_02");
        listTests.add(2, "pic_03");
        listTests.add(3, "pic_04");
        listTests.add(4, "pic_05");
        listTests.add(5, "pic_06");
        listTests.add(6, "pic_07");
        listTests.add(7, "pic_08");
        listTests.add(8, "pic_09");
        listTests.add(9, "pic_10");
    }

    @Override
    public String get_test_pic_path(Integer seq) {return listTests.get(seq);}

    @Override
    public void delete_Test(Integer seq) { listTests.remove(seq);}

    @Override
    public void update_Test(Integer seq, String path) {listTests.add(seq,path);}
}
