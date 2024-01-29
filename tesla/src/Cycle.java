public class Cycle {
    int id;
    String name;
    Cycle(int i,String s){
        id = i;
        name = s;
    }
    Cycle(Cycle ct){
        id = ct.id;
        name = ct.name;
    }
    void display(){
        System.out.println(id+""+name);
    }

    public static void main(String[] args) {
        Cycle cycle1 = new Cycle(1,"Mozammil");
        Cycle cycle2 = new Cycle(cycle1);
        cycle1.display();
        System.out.println("--------------");
        cycle2.display();

    }
}
