package 猫和狗抽象类;

public class AnimalDemo {
    public static void main(String[] args) {
//        按照多态的方式进行调用
        Animal a = new cat();
        a.setName("jiafei");
        a.setAge(100);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a = new cat("jiafei",100);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
    }
}
