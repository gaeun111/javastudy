package com.test.exam02;

class Family{
    void hello() { System.out.println("인사합니다.");}
}

class kimFamily extends Family{
    void hello() { System.out.println("안녕하세요");}
    void dinner() { System.out.println("식사나 한번 하시죠");}
    void drink() { System.out.println("술");}
}

class ParkFamily extends Family{
    void hello(){ System.out.println("dks안녕하세요.");}
    void fishing(){ System.out.println("낚시");}

}

public class PolymorphismExam {
    
    public static void main(String[] args) {
        Family kimF = new kimFamily();
        kimF.hello();

        Family ParkF = new ParkFamily();
        ParkF.hello();


    }
}
