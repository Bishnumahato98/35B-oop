// 1. Write a program that prompts the user to enter five integer values and reads them into an array. The program should consist of the following methods:
// a method named "max" that reads an array of integer values and returns the maximum value
// a method named "indexOfHighest" that returns the index of the highest element in an array of integers. If more than one such element exists, return the smallest index.
// Invoke the above methods and demonstrate them in the program.


// import java.util.Scanner;
// public class ExamPattern {

//     public static int max(int[] array) {
//         int maxValue = array[0];
//         for (int i = 1; i < array.length; i++) {
//             if (array[i] > maxValue) {
//                 maxValue = array[i];
//             }
//         }
//         return maxValue;
//     }

//     public static int indexOfHighest(int[] array) {
//         int maxValue = array[0];
//         int maxIndex = 0;
//         for (int i = 1; i < array.length; i++) {
//             if (array[i] > maxValue) {
//                 maxValue = array[i];
//                 maxIndex = i;
//             }
//         }
//         return maxIndex;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int[] numbers = new int[5];

//         System.out.println("Enter five integer values:");
//         for (int i = 0; i < 5; i++) {
//             numbers[i] = scanner.nextInt();
//         }

//         int maxValue = max(numbers);
//         int maxIndex = indexOfHighest(numbers);

//         System.out.println("Maximum value: " + maxValue);
//         System.out.println("Index of highest value: " + maxIndex);
//     }
// }





// Design and implement a Java program that simulates the undo feature of a text editor using a stack. The program should support adding text to the editor and undoing changes. The stack should store strings, each representing a version of the text. Implement methods for: adding text to the editor: addText(String text) undoing changes: undo() getting the current text: getCurrentText() 
// import java.util.Stack;
// public class ExamPattern{
//     public static void main(String[] args) {
//         TextEditor editor = new TextEditor();
//         editor.addText("Hello");
//         System.out.println("Current text: " + editor.getCurrentText());

//         editor.addText(" World");
//         System.out.println("Current text: " + editor.getCurrentText());  
        
//         editor.undo();
//         System.out.println("Current text: " + editor.getCurrentText());  
        
        
//         editor.undo();
//         System.out.println("Current text: " + editor.getCurrentText());  
//     }
// }

// class TextEditor{
//     private Stack<String> textStack;
//     private String currentText;

//     public TextEditor() {
//         textStack = new Stack<>();
//         currentText = "";
//     }
//     public void addText(String text) {
//         textStack.push(currentText);  
//         currentText += text;
//     }
//     public void undo() {
//         if (!textStack.isEmpty()) {
//             currentText = textStack.pop();
//         }
//     }
//     public String getCurrentText() {
//         return currentText;
//     }
// }


abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length, width;


    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}

class Square extends Shape {
    private double side;

    // Constructor
    Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    double perimeter() {
        return 4 * side;
    }
}

public class ExamPattern {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(3);

        // Displaying area and perimeter for each shape
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());
    }
}
