public class Main {
    public static void main(String[] args) {
        //Задание №1
        Recursion first_ex = new Recursion();
        first_ex.naturalNum(20);
        System.out.println();
        //Задание №2
        Recursion second_ex = new Recursion();
        long time = System.currentTimeMillis();
        System.out.println("Второе задание цикл: " + second_ex.findNumF(10));
        System.out.println("Время второго задания с циклом: " + ( System.currentTimeMillis() - time));

        int[] z = new int[100000];
        for (int i = 0; i < 100000; i++){
            z[i] = i;
        }
        int stop = z.length - 1;
        int start = 0;
        long time_two = System.currentTimeMillis();
        System.out.println("Второе бинарный поиск " + second_ex.findNumR(z, 11, start, stop) );
        System.out.println("Второе бинарный поиск " + second_ex.findNumR(z, 9000000, start, stop) ); //если числа нет, возвращается -1
        System.out.println("Врем выполнения бинарного поиска: " + (System.currentTimeMillis() - time_two));
        // бинарное дерево поиска
        System.out.println("\nБинарное дерево\n");
        BinaryTree bt = new BinaryTree();
        bt.add(3);
        bt.add(2);
        bt.add(5);
        System.out.println(bt.root.value);
        System.out.println(bt.root.left.value);
        System.out.println(bt.root.right.value);
        bt.del(5);
        System.out.println(bt.root.right);
        //Задание №3
        Recursion third_second = new Recursion();
        System.out.println("Третье задание: " + third_second.findRoot(10));


    }
}
