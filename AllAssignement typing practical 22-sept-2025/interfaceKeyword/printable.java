package interfaceKeyword;

interface Printable {
    void print();
}

interface Showable {
    void show();
}

class A6 implements Printable {
    public void print() {
        System.out.println("hello");}
    }

    class A7 implements Printable, Showable {
        public void show() { System.out.println("Hello"); }
        public void print() { System.out.println("Welcome"); }
    }

 

