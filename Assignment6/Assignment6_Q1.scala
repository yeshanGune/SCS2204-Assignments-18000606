import scala.math._

case class Point(var a:Int, var b:Int){
    def x = a;
    def y = b;
}

object Assignment6_Q1{
    def square(a:Int):Int={
        a*a;
    }

    def add(p1:Point, p2:Point):Point={
        Point(p1.x+p2.x , p1.y+p2.y);
    }

    def move(p:Point,x:Int,y:Int):Unit={
        p.a = p.a+x;
        p.b = p.b+y;
    }

    def distance(p1:Point,p2:Point):Double={
        sqrt((square(p1.x - p2.x) - square(p1.y - p2.y)).abs);
    }

    def invert(p1:Point):Unit={
        var temp = p1.a;
        p1.a = p1.b;
        p1.b = temp;
    }

    def main(args:Array[String]):Unit={
        var p1 = Point(2,3);
        var p2 = Point(5,9);

        var p3 = add(p1,p2);
        println("Added new point: " + p3);

        move(p1,1,2);
        println("After moved: " + p1);

        println("Distance: " + distance(p1,p2));

        var p4 = Point(3,4);
        invert(p4);
        println("Inverted Point: " + p4);

    }
}