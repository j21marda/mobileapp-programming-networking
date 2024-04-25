package com.example.networking;

public class Mountain {
    private String name;
    private String location;
    private int height;

    public Mountain ()
    {
        name="inget namn";
        location="ingen plats";
        height=-1;
    }

    public Mountain(String n, String l, int h)
    {
        name=n;
        location=l;
        height=h;
    }

    public String info ()
    {
        String tmp=new String();
        tmp+=name+" is located in the mountain range "+location+" and reaches "+height+"m above sea level.";
        return tmp;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}



