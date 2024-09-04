package Z_OOC;

public class _1ClassAndObject {
    private String name;
    int age;

    void bark() {
        System.out.println(name + " is barking" + " its age is " + age);
    }

    public static void main(String[] args) {
        _1ClassAndObject obj = new _1ClassAndObject();
        obj.name = "kutta";
        obj.age = 10;
        obj.bark();
    }
}
