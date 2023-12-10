package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength) {
        for (int i = 1; i <= sideLength; i++) {
            String text = "";
            for (int j = 1; j <= sideLength; j++) {
                if (i == 1 || j == 1 || j == sideLength || i == sideLength) {
                    text += "8";
                } else {
                    text += " ";
                }
            }
            System.out.println(text);
        }
    }
}
