package OOPS;

public class Interfaces {
    public static void main(String[] args) {
        m416 gun = new m416();
        gun.recoil();
        gun.company();

        mg3 ff = new mg3();
        ff.recoil();

    }

}

interface Pubg {
    void recoil();

}

interface Bgmi {
    void company();
}

class m416 implements Pubg, Bgmi {
    public void recoil() {
        System.out.println("Lowest recoil amongst all guns");
    }

    public void company() {
        System.out.println("Krafton company");
    }
}

class kar19 implements Pubg {
    public void recoil() {
        System.out.println("best gun");
    }
}

class mg3 implements Pubg {
    public void recoil() {
        System.out.println("Fastest gun in pubg");
    }
}