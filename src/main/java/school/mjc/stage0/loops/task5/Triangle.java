package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            String s="";
            for (int j = 1; j <=cathetusLength ; j++) {
                if (j<=i){
                    s+="8";
                }else{
                    s+=" ";
                }
            }
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.printTriangle(5);
    }
}
