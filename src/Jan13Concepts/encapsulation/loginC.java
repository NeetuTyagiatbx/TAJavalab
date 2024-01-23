package arrbasics.src.Jan13Concepts.encapsulation;

public class loginC {
    public static void main(String[] args) {
        vlogin obj1 = new vlogin("admin" , "admin");
        // anyone can change the datamembers using instance obj1 here
        boolean result = obj1.check("admin" , "uadmin");
        System.out.println(result);
// not a good practice as anyone can change
        obj1.pword = "uadmin";
        boolean result1 = obj1.check("admin" , "uadmin");
        System.out.println(result1);
    }

}
class vlogin{

    public String uName;
    public String pword;

    public vlogin(String refuName, String refpword) {
        this.uName = refuName;
        this.pword = refpword;
    }
    boolean check(String refuName, String refpword){
        if (this.uName.equalsIgnoreCase(refuName) && this.pword.equalsIgnoreCase(refpword) ){
            System.out.println("Logged in");
            return true;
        }
        else {
            System.out.println("Not logged in ");
            return false;
        }
    }





}
