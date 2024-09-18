public class Point {
    int x,y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
 class rectangle {
     public int square(Point one, Point two) {
         return (one.x - two.x) * (one.y - one.x);
     }
 }