package chap05.examples;

class Person_5{}
class Student_5 extends Person_5{}
class Researcher_5 extends Person_5{}
class Professor_5 extends Researcher_5{}

public class InstanceOfEx {
    static void print(Person_5 p){
        if(p instanceof Person_5)
            System.out.print("Person ");
        if(p instanceof Student_5)
            System.out.print("Student ");
        if(p instanceof Researcher_5)
            System.out.print("Researcher ");
        if(p instanceof Professor_5)
            System.out.print("Professor ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("new Student() ->\t"); print(new Student_5());
        System.out.print("new Researcher() ->\t"); print(new Researcher_5());
        System.out.print("new Professor() ->\t"); print(new Professor_5());
    }
}
