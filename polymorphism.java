public class polymorphism {
    public static void main(String[] args) {
        MathOperation p1=new MathOperation();
        System.out.println(p1.add(10,20));
        System.out.println(p1.add(10,20,30));

        p1.add();




        Document d1=new Document();
        d1.print("black");
        Document d2=new Msword();
        d2.print("White");

        Document d3= new office365();
        d3.print("Yellow");

    }
}


//method overloading - compiletime polymorism
// making same function mutiple time with diff in parameter

class MathOperation{
    int add(int num1, int num2){
        return num1+num2;
    }

    int add(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    double add(double num1,double num2){
        return num1+num2;
    }

    void add(){
        System.out.println("Invalid operation");
    }
}








//method overriding - runtime polymorsphim
//make the same function of ParentClass in children

class Document{
    public void print(String paper){
        System.err.println("Document Printing");
    }
}

//method overriding can be done in multi level inheritance
class Msword extends Document{
    boolean online =true;
    @Override
    public void print(String paper){
        System.out.println("Ms word is printing");
        
    }
}

//method overriding can be done in multi level inheritance
class office365 extends Msword{
    boolean online =true;
    @Override
    public void print(String paper){
        System.out.println("Online is printing");
        
    }
}