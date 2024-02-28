package org.example;
import java.util.Scanner;

public class ShapeDrawer {
    Scanner scanner = new Scanner(System.in); //masukin user input

    public void displayMenu(){
        System.out.println("pilih mau yg mana");
        System.out.println("1. segitiga siku2");
        System.out.println("2. segitiga sama kaki");
        System.out.println("3. persegi");
        System.out.println("4. persegi panjang");
        System.out.println("5. Exit");
    }
    public void drawTriangleSS(int height){
        //Nested loop
        //Outer loop (rownya)
        for(int i = 1; i <= height;i++){
            for(int j = 1; j<=1;j++) {
                System.out.print("*");
            }
            System.out.println();
            }
        }

    public void drawTriangleSK(int height2){
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
    public void drawSquare(int height3){
       // System.out.print("drawing square");
        for (int i = 1; i <= height3 ; i++) {
            for (int j = 1; j <= height3 ; j++) {
                System.out.print("*");
            }
            //System.out.print(" " + "baris ke" + i);
            System.out.println();
        }
    }

    public void drawRectangle(int lebar,int panjang){
        for(int j = 1;j <= panjang ; j++){
            System.out.print("*");
        }
        System.out.println();
        for(int i = 1;i <= lebar; ){
            System.out.print("*");
        }
    }
public void drawShape(int choice){
        switch(choice){
            case 1:
                System.out.println("Masukkan panjang segitiga siku2 :");
                int height = scanner.nextInt();
                drawTriangleSS(height); //fungsi gambar segitiga
                break;
            case 2:
                System.out.println("Masukkan panjang segitiga sama kaki :");
                int height2 = scanner.nextInt();
                drawTriangleSK(height2);
                break;
            case 3:
                System.out.println("Masukkan panjang persegi :");
                int height3 = scanner.nextInt();
                drawSquare(height3);
                break;
            case 4:
                System.out.println("Masukkan panjang persegi panjang:");
                int panjang = scanner.nextInt();
                System.out.println("Masukkan lebar persegi panjang:");
                int lebar = scanner.nextInt();
                drawRectangle(panjang,lebar);
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input");
        }
}
    public void run(){
        // loop untuk nampilin menu
        while(true){
            displayMenu();
            System.out.println("mau yang mana? :");
            int choice = scanner.nextInt(); // mau input jenisnya int
            drawShape(choice);
            System.out.println();

        }
    }
    public static void main(String[] args){
    // program untuk gambar ASCII shape
        ShapeDrawer drawer = new ShapeDrawer();
        drawer.run();
    }
}
