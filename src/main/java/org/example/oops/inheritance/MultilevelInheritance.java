package org.example.oops.inheritance;

public class MultilevelInheritance {
    public static void main(String[] args) {
        BhandaraSBI bhandaraSBI = new BhandaraSBI();
        bhandaraSBI.detailBhandaraSBI();
        bhandaraSBI.detailSBI();
        bhandaraSBI.detailBank();
    }
}
class Bank{
    public void detailBank(){
        System.out.println("Hello This is All India Bank");
    }
}

class SBI extends  Bank{
    public void detailSBI(){
        System.out.println("Hello This is SBI bank located in mumbai");
    }
}

class BhandaraSBI extends SBI{
    public void detailBhandaraSBI(){
        System.out.println("Hello This is Bhandara SBI Branch located in behind bhandara police station");
    }
}