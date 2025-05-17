package org.page;

public class Singletondatabase {//insted of creating multiple objects we are storing values again and again in a same object inorder to reduce storage.
         
	
	private Singletondatabase() {//we are avoiding direct object creation/creating a default constructor/
        	   System.out.println(123);//private ah create panna inoru class la object creat panna mudiyathu.
	}
        	   // *how to restrict object /referance
        	   public static int id(){
        		   int id = 123;
        		   return id;
        	   }
//        	   
//        	   public static void main(String[]args) {
//        		   int id=id();
//        		   System.out.println(id);
//        	   }
        	   
        	   
        	   
        	   
        	   //example after creating (without ctreating object method)
        	   public void age() {
        		   System.out.println(25);
			}
        	   
          /* **************---main content----**************** */      	   
        	   
        	  //same for *
        	   //static ah oru variable 'd' la singletondatabase ah store pandrom.
        	   private static  Singletondatabase d;
        	   public  static Singletondatabase getSingletondatabase(){
        		   //object creation ah restrict panniyachu.ipo memory wastage ah restric pananum.so if conditon kudukrom.
        		   if(d==null) {
        		   d= new Singletondatabase();//object created
				     }
        		   return d; 
        	   }
        	   
        	   /* ************************** */
        	   public static void main(String[]args) {
        		   System.out.println(d);
        		   getSingletondatabase();
        		   System.out.println(d);
        		   
        		   getSingletondatabase();
        		   System.out.println(d);

        		   getSingletondatabase();
        		   System.out.println(d);
        		   
        	   }
           }


