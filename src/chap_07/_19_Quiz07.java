package chap_07;

public class _19_Quiz07 {
    public static void main(String[] args) {
        Hamburger[] hamBurgers = new Hamburger[3];
        hamBurgers[0] = new Hamburger();
        hamBurgers[1] = new CheeseBurger();
        hamBurgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("---------------------");
        for (Hamburger hamBurger: hamBurgers) {
            hamBurger.cook();
            System.out.println("---------------------");
        }

        System.out.println("메뉴 준비가 완료되었습니다.");
    }
}

class Hamburger {
    public String name;
    static String[] ingredients = {"양상추", "패티", "피클"};

    public Hamburger() {
        this("햄버거");
    }

    protected Hamburger(String name) {
        this.name = name;
    }

    public void cook() {
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        for (String ingredient:ingredients) {
            System.out.println("+ " + ingredient);
        }
    }
}


class CheeseBurger extends Hamburger {
    CheeseBurger(){
        super("치즈버거");
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("+ 치즈");
    }
}

class ShrimpBurger extends Hamburger{
    ShrimpBurger(){
        super("새우버거");
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("+ 새우");
    }
}
