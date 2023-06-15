public class TextObjectoriented {

    public static void main(String[] args) {


        //多态：可以将父类的变量指向子类的对象(子类的对象可以赋给父类的引用)
        /*在之前的创建对象中我们将父类的对象赋给父类引用，把子类的对象赋给子类引用
        Pople pople = new Pople();
        Student student = new Student();

        但是现在，我们把子类的对象赋给父类的引用
         */

        Pople pople = new Student();

        pople.popleName = "王五";
        pople.popleFun();

        /*在这里我们发现虽然我们把子类的对象赋给了父类的引用，但是我们还是无法方法问到
        子类中的studentFun();方法，这是因为在父类中并没有这个方法，父类只能方法问到子类继承
        父类的方法和属性，而无法访问子类自己的属性和方法
         */
    }
}
