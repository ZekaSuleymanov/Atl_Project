package lesson_14_Desing_Pattern_Interface_Abstraction;

// implement to Polygon interface
class Rectangle implements Polygon{
    // imolementation of abstract metod
    public void getArea(int length, int breadth){
        System.out.println("The area of the rectangle is " + (length * breadth));
    }

    @Override
    public void getAres(int length, int breadth) {

    }
}
