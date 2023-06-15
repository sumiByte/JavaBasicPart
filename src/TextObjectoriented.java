public class TextObjectoriented {

    public static void main(String[] args) {


        //在这里我一般会创建相对应的类的对象
        Pople pople = new Pople();
            /*在这里我们将Pople这个对象给了pople这个引用，也就是父类的引用
            我们可以访问父类中的所有属性和方法
             */
        pople.popleName = "张三";
        pople.popleFun();

        /*当然我们创建的子类Student继承了父类，它也可以访问到父类Pople中的属性和方法
        比如以下这个例子
         */

        Student student = new Student();

        student.popleName = "李四";
        student.popleFun();
    }
}
