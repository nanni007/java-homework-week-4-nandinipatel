public class Programme_25 {
    //java program to overload constructors
    int id;
    String name;
    int age;
    //creating two arg constructors
    Programme_25(int i, String n){
        id =i;
        name=n;
    }
    //creating three agr constructor
    Programme_25(int i, String n, int a){
        id = i;
        name=n;
        age = a;
    }
    public void display(){
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Programme_25 obj1 = new Programme_25(111,"Karan");
        Programme_25 obj2 = new Programme_25(222,"Aryan",25);
        obj1.display();
        obj2.display();
    }
}
