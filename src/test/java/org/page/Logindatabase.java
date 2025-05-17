package org.page;

public class Logindatabase {
          public static void main(String[]args) {
        	 int id = Singletondatabase.id();
        	 System.out.println(id);
          }
          
          Singletondatabase d= Singletondatabase.getSingletondatabase();
         // System.out.println(System.identityHashcode(d));
          //d.age();
          
          Singletondatabase d1= Singletondatabase.getSingletondatabase();
          // System.out.println(System.identityHashcode(d1));
}
