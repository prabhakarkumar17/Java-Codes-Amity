abstract class Key {
    static void check(){
        System.out.println("yes");
        /*question is ...can we call abstract class  name using static functions  */

    }
}
class  Home{
 public static void main(String args[]){
    Key.check();
 }
}

/*answer is ...yes we can do  */