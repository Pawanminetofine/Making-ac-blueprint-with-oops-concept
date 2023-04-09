// Here we create the ac class //
import java.util.*;
public class Acsystem{
    public static class Ac{//blue print of the ac
        String company;
        String madein;
        int year;
        int rating;
        public Ac(String company,String madein,int year,int rating){
            //this is the constructor
             this.company=company;
             this.madein=madein;
             this.rating=rating;
    }
    }
    public static void main(String[] args){
        //object of the v 
       Ac v = new Ac("samsung","india",2003,4);//object of the v
        System.out.print(v.company +" ");
        System.out.print(v.madein+" ");
        System.out.println(v.rating +"");
        //object of the v1 datatype and also we can say that it is the real entity
        Ac v1=new Ac("bluestar","india",2003,3);
        System.out.print(v1.company +" ");
        System.out.print(v1.madein+" ");
        System.out.print(v1.rating +"");
    }
}
//-------------------notice----------------
//this keyword always use with static class
//The most common use of the this keyword is to eliminate the confusion between class attributes and parameters with the same name 
//------important point about the constructor------
//Constructor in java is used to create the instance of the class. 
//Constructors are almost similar to methods except for two things - its name is the same as the class name and it has no return type