package oop1.ex;

public class Rectangle {

    int width = 0;
    int height = 0;


    int calculateArea(int width, int height) {
        return width * height;
    }

    int calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }

    boolean isSquare(int width, int height) {
        return width == height;
    }
}
