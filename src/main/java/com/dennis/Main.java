package com.dennis;

import com.dennis.access.Film;

public class Main {
    void main() {

        Film film = new Film("Titanic", 1997, false);

      Film film2 = new Film("Titanic", 1997, false);

      IO.println(film == film2);

//      String a = "He";
//      a+="j";
//      String b = "He";
//      b+="j";
//    IO.println(b);
//        IO.println(a);
//      IO.println(a==b);
//
//      IO.println(a.equals(b));

        int x = 3;
        int y = 2;

        IO.println(y+1==x);

    }
}