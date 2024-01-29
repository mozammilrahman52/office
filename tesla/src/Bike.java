public class Bike {
   int i;
   int j;
   Bike(int i,int j){
       this.i=i;
       this.j=j;
       System.out.println("argument");
   }
   Bike(Bike b){
       i = b.i;
       j = b.j;
       System.out.println("copy constructor");
   }
   public void display(){
       System.out.println("i=" +i);
       System.out.println("j=" +j);
   }

    public static void main(String[] args) {
        Bike bike1 = new Bike(101,501);
        Bike bike2 = new Bike(bike1);

        bike1.display();
        System.out.println("=======================");
        bike2.display();
        }
    }

