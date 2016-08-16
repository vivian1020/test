/**
 * Created by liujw on 2016/8/11.
 */
class FatherClass {
    public int value;
    public void f(){
        value = 100;
        System.out.println("FatherClass.value="+value );
    }
}

class ChildClass extends FatherClass {
    public int value;
    public void f() {
        super.f();//调用父类的函数
        value = 200;
        System.out.println("ChildClass.value="+value);
        System.out.println(value);
        System.out.println(super.value);
    }
}
public class TestInherit {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        cc.f();
    }
}
