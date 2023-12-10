package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int i = 1; i <=height ; i++) {
            String text = "";
            for (int j = 1; j <=length ; j++) {
//                int a = (length-1)/2+1;
                if (i==1||height==i||j==1||j==length) {
                    text+="8";
                }else{
                    text+=" ";
                }
            }

            System.out.println(text);

        }

    }
}
