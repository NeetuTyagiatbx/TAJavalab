package arrbasics.src.Jan7Opps.inheritance.prog2;

public class poog1thiskeyword {
    //instance variable
    String name ;

    void printwithoutthis(){
        System.out.println(name);
    }
    poog1thiskeyword(String objRefName){
        //System.out.println("Param const name" +this.name);   o/p is null
        this.name = objRefName;
        System.out.println("Param const name " +name );
    }

    public static void main(String[] args) {
        poog1thiskeyword p1 =new poog1thiskeyword("Neetu");
    }
}
