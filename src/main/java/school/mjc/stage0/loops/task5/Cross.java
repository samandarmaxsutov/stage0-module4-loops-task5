package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 1; i <=sideLength ; i++) {
            String text = "";
            for (int j = 1; j <=sideLength ; j++) {
                int a = (sideLength-1)/2+1;
                if (a==i||a==j) {
                    text+="8";
                }else{
                    text+=" ";
                }
            }

            System.out.println(text);

        }
    }
}
