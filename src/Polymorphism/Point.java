package Polymorphism;

public class Point {
    int m_x, m_y;
    public Point(int x, int y){
        m_x = x;
        m_y = y;
    }
    public Point(){
        this(10,10);
    }
    public int getX(){
        return m_x;
    }
    public int getY(){
        return m_y;
    }

    public static void main(String[] args) throws InterruptedException {
//        Point p = new Point(20,40);
//        System.out.println(p.getX());
//        System.out.println(p.getY());
        for (int i = 0; i < 10; i++) {
            System.out.print("hello ");
            Thread.sleep(1000);
            System.out.println("world");
        }

    }
}
