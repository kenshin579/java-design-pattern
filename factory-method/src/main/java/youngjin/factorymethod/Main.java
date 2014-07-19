package youngjin.factorymethod;

import youngjin.factorymethod.framework.Factory;
import youngjin.factorymethod.framework.Product;
import youngjin.factorymethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("홍길동", "health");
        Product card2 = factory.create("이순신");
        Product card3 = factory.create("강감찬");
        card1.use();
        card2.use();
        card3.use();
    }
}
