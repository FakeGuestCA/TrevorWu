package com.example.friendbook;

public class friend {
    public String name;
    public String email;
    public String phonenum;
    public String nickname;

    friend(String n, String e, String p, String ni) {
        name = n;
        email = e;
        phonenum = p;
        nickname = ni;
    }
    public String toString(){
        return name;
    }
}
