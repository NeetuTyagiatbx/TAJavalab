package src;

public class VarScope2_Instance_static {
    public static String myname = "Static var Neetu" ;
    public String name ="Instance Variable Neetu";
    public int i;

    public static void main(String[] args) {
        System.out.println("Static variable value is : " +VarScope2_Instance_static.myname);

        VarScope2_Instance_static nameObj = new VarScope2_Instance_static();
        System.out.println("Instance variable value is : "  +nameObj.name);
    }







}
