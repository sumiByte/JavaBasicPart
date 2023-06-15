public class TextObjectoriented {

    public static void main(String[] args) {


        //到了这里我们讲讲如果在父类的属性上加上private是否能够被继承和使用

        Student student = new Student();

        student.popleName = "老六";

        /*在这里我们可以看到，popleNumber属性加上private后就变成私有属性了
        当我们通过子类调用时发现它是无法访问的。但这个父类中的popleNumber属性也确实被继承了
        只是不能够被使用。
        举个例子，当你的亲戚因病去世时，他的财产你是有继承权的，但不代表你有使用权，因为在他
        立下遗嘱明确告诉你这笔遗产属于你时，你才有使用权。
         */

    }
}
