public class TextObjectoriented {

    public static void main(String[] args) {


        //现在我们来看父类的对象是否能赋给子类引用
        Student student = new Pople();

        /*这里我们发现它报错了，为什么呢，因为子类的属性和方法的丰富度是永远大于父类的
        因此，我们无法将一个大的类强塞到小类里。举个例子，我们前面学过八大基本数据类型
        中，我们可以将byte类型转化为int类型，这叫隐式类型提升，但是int却不一定能够转为byte
        因为，因为int的数值和远大于byte。
         */

    }
}
