package chap_08;

import chap_07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; // public - 다른 패키지임에도 불구하고 접근 가넝
//        b1.resolution = "FHD"; // default - 같은 패키지 내에서만 가넝
//        b1.price = 200000; // private
//        b1.color = "black"; // protected

    }
}
