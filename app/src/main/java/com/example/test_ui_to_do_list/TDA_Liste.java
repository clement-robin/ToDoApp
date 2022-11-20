package com.example.test_ui_to_do_list;

import android.widget.TextView;

import java.util.ArrayList;

public class TDA_Liste {
    private static int counter = 0;
    private ArrayList<TDA_Item> li_List;
    private TextView li_Name;
    private int id;

    // constructors :
    public TDA_Liste(){
        this.li_List = new ArrayList<TDA_Item>();
        this.li_Name = null;
        this.id = counter++;
    }

    public TDA_Liste(TextView listName){
        this.li_List = new ArrayList<TDA_Item>();
        this.li_Name = listName;
        this.id = counter++;
    }

    // getters and setters :
    public ArrayList<TDA_Item> getLi_List() {
        return li_List;
    }

    public void setLi_List(ArrayList<TDA_Item> li_List) {
        this.li_List = li_List;
    }

    public TextView getLi_Name() {
        return li_Name;
    }

    public void setLi_Name(TextView li_Name) {
        this.li_Name = li_Name;
    }

    public int getId() {
        return id;
    }
}