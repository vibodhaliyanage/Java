package model;

class x {

    private A a;

    public void setA(A a) {
        this.a = a;
    }

    public void p() {

        a.m();
    }
}

class A {

    public void m() {

        System.out.println("A m");
    }
}

class B {

    public void n() {

        System.out.println("B n");
    }

}
