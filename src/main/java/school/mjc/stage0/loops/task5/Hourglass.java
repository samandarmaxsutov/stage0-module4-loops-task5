package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 1; i <=height ; i++) {
            String text = "";
            for (int j = 1; j <=height ; j++) {
                int a = (height-1)/2+1;
                if (a==j||height-j+1==a||i==j||height-j+1==i||i==1||height==i) {
                    text+="8";
                }else{
                    text+=" ";
                }
            }

            System.out.println(text);

        }
    }
}
