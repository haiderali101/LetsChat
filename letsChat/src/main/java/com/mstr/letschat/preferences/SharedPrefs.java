package com.mstr.letschat.preferences;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefs {

    SharedPreferences sp;

    SharedPreferences.Editor e;

    String PREF_NAME = "userdata";

    String user_number;
    String link_images;
    String delivered_to;


    public SharedPrefs(Context context) {
        sp = context.getSharedPreferences(PREF_NAME, 0);
    }


    public String getDelivered_to() {
        delivered_to = sp.getString("delivered_to", "");
        return delivered_to;
    }

    public void setDelivered_to(String delivered_to) {
        e = sp.edit();
        e.putString("delivered_to", delivered_to);
        e.apply();
        this.delivered_to = delivered_to;
    }

    public String getLink_images() {
        link_images = sp.getString("link_images", "");
        return link_images;
    }

    public void setLink_images(String link_images) {
        e = sp.edit();
        e.putString("link_images", link_images);
        e.apply();
        this.link_images = link_images;
    }



    public String getUser_number() {
        user_number = sp.getString("user_number", "");
        return user_number;
    }

    public void setUser_number(String user_number) {
        e = sp.edit();
        e.putString("user_number", user_number);
        e.apply();
        this.user_number = user_number;
    }
}

