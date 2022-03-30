package com.test.exam03;

interface Sales {
    
    public void manager();
    public void goal();
    public void product();
}

class ATeam implements Sales {

    @Override
    public void manager() {
        System.out.println("A팀장님입니다.");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void goal() {
        System.out.println("A팀은 올해 70억을 달성해보겠습니다");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void product() {
        System.out.println("A팀은 tv를 판매하겠습니다");
        // TODO Auto-generated method stub
        
    }
}
class BTeam implements Sales {

    @Override
    public void manager() {
        System.out.println("B팀장님입니다");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void goal() {
        System.out.println("B팀은 올해 100억 달성하겠습니다");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void product() {
        System.out.println("B팀은 냉장고를 판매하겠습니다");
        // TODO Auto-generated method stub
        
    }
}    


public class InterfaceExam {

    public static void main(String[] args) {
        
        ATeam aSalePlan = new ATeam();
        aSalePlan.manager();
        aSalePlan.goal();
        aSalePlan.product();

        BTeam bSalePlan = new BTeam();
        bSalePlan.manager();
        bSalePlan.goal();
        bSalePlan.product();
    }
}
