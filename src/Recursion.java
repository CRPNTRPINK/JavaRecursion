public class Recursion {
    long time = System.currentTimeMillis();
    int x;
    int[] y = new int[10000000];
    public int naturalNum(int x){
        if (x == -1){
            return x;
        }
        System.out.println(x);
        return naturalNum(x-1);
    }
    // задание №1
    public String findNumF(int x){
        for (int i = 0; i < y.length; i++){
            y[i] = i;
        }
        for (int i: y){
            if (i == x){
                return i + "-" + "True";
            }
        }
        return "False";
    }
    // задание №2
    public int findNumR(int[] list, int x, int start, int stop){
        if (start > stop){
            return -1;
        }
        else{
            int center = (start + stop) / 2;
            if(x == list[center]){
                return center;
            }
            else if (x < list[center]){
                return findNumR(list, x, start, center - 1);
            }
            else {
                return findNumR(list, x, center + 1, stop);
            }
        }
    }

    //Задание №3
    public float findRoot(float x){
        int math = (int) (Math.cos(Math.toRadians(Math.pow(x, 5))) + Math.pow(x, 4) - 345.3 * x - 23);
        if (math < 0){
            return x;
        }
        else if (x > 10){
            return 0;
        }
        return findRoot(x - 0.001f);
    }

}
