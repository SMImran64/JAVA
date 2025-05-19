
package midlevelquestion6;


public class MethodOverLoading {
    public static void main(String[] args) {
        
        Triangle t = new Triangle(40, 60);
        
        Circle c = new Circle(5);
        
        Ractangle r = new Ractangle(60, 70);
        
        System.out.println("The area of Circle is: "+c.area());
        System.out.println("The area of Rectangle is: "+r.area());
        System.out.println("The area of Triangle is: "+t.area());
    }
}
