package org.example;
import java.util.Scanner;
import java.util.InputMismatchException;

interface Shape{
    void draw(int height, int side);
}
// implements : kombinasi polymorphism & inheritance
class drawTriangleSS implements Shape {
    @Override // Overriding (mengganti secara paksa content dari function dalam polymorphism)
    public void draw(int height,int side) {
        //Nested loop
        //Outer loop (rownya)
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class drawTriangleSK implements Shape {
    @Override
    public void draw(int height2, int side) {
        for (int i = 1; i <= height2; i++) {
            // Print spaces to center the triangle
            for (int j = height2 - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print stars for the triangle
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }

    }

    static class drawSquare implements Shape {
        @Override
        public void draw(int height3, int side) {
            // System.out.print("drawing square");
            for (int i = 1; i <= height3; i++) {
                for (int j = 1; j <= height3; j++) {
                    System.out.print("*");
                }
                //System.out.print(" " + "baris ke" + i);
                System.out.println();
            }
        }

    }

    public static class ShapeDrawerPolymorph1 {
        Scanner scanner = new Scanner(System.in); //masukin user input

        public void displayMenu() {
            System.out.println("pilih mau yg mana");
            System.out.println("1. segitiga siku2");
            System.out.println("2. segitiga sama kaki");
            System.out.println("3. persegi");
            System.out.println("5. Exit");
        }


        public void drawShape(int choice) {
            try {
                switch (choice) {
                    case 1:
                        System.out.println("Masukkan panjang segitiga siku2 :");
                        int height = scanner.nextInt();
                        new drawTriangleSS().draw(height, 1); //fungsi gambar segitiga
                        break;
                    case 2:
                        System.out.println("Masukkan panjang segitiga sama kaki :");
                        int height2 = scanner.nextInt();
                        new drawTriangleSK().draw(height2, 1);
                        break;
                    case 3:
                        System.out.println("Masukkan panjang persegi :");
                        int height3 = scanner.nextInt();
                        new drawSquare().draw(height3, 1);
                        break;

                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Please enter a valid integer");
                scanner.next();
            }
        }

        public void run() {
            // loop untuk nampilin menu
            while (true) {
                displayMenu();
                System.out.println("mau yang mana? :");
                try {
                    int choice = scanner.nextInt(); // mau input jenisnya int
                    drawShape(choice);
                    System.out.println();
                } catch (InputMismatchException ime) {
                    System.out.println("Please enter a valid integer");
                    scanner.next();
                }
            }
        }
    }

    public static void main(String[] args) {
        // program untuk gambar ASCII shape
        ShapeDrawerPolymorph1 drawer = new ShapeDrawerPolymorph1();
        drawer.run();
    }
}
