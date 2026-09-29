package org.example.oops.inheritance;

public class MultilevelInheritance {
    public static void main(String[] args) {
        BhandaraSBI bhandaraSBI = new BhandaraSBI();
        bhandaraSBI.detailBhandaraSBI();
        bhandaraSBI.detailSBI();
        bhandaraSBI.detailBank();

        BhandaraSBI sbi = new BhandaraSBI();
        sbi.show();
    }
}
class Bank{
    public void detailBank(){
        System.out.println("Hello This is All India Bank");
    }
    public void show(){
        System.out.println("This is Dishant Bank");
    }
}

class SBI extends  Bank{
    public void detailSBI(){
        System.out.println("Hello This is SBI bank located in mumbai");
    }
    public void show(){
        System.out.println("This is Dishant SBI");
    }
}

class BhandaraSBI extends SBI{
    public void detailBhandaraSBI(){
        System.out.println("Hello This is Bhandara SBI Branch located in behind bhandara police station");
    }
    public void show(){
        System.out.println("This is Dishant SBI Bhandara");
    }
}