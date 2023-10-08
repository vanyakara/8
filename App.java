/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany;

import java.util.Scanner;

/**
 *
 * @author Ваня
 */
public class App {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Izberete optsiq:");
        System.out.println("1. Kvadrat");
        System.out.println("2. Pravougulnik");
        System.out.println("3. Prost poligon");
        System.out.println("4. Okrugnost");
        System.out.println("5. Izhod");
        System.out.print("Vuvedete nomer na optsiqta: ");
        int choice=scan.nextInt();
        switch(choice){
            case 1:
                calculateSquare();
                break;
            case 2:
                calculateRectangle();
                break;
            case 3:
                calculatePolygon();
                break;
            case 4:
                calculateCircle();
                break;
            case 5:
                System.out.println("Izhod ot programata.");
                scan.close();
                System.exit(0);
            default:
                System.out.println("Nevalidna optsiq.");
                break;
        }
    }
    public static void calculateSquare(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Vuvedete strana na kvadrata: ");
        double side=scan.nextDouble();
        double perimeter=4*side;
        double area=side*side;
        System.out.println("Perimeter na kvadrata: "+perimeter);
        System.out.println("Plosht na kvadrata: "+area);
    }
    public static void calculateRectangle(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Vuvedete dulzhina na pravougulnika: ");
        double length=scan.nextDouble();
        System.out.print("Vuvedete shirochinata na pravougulnika: ");
        double width=scan.nextDouble();
        double perimeter=2*(length+width);
        double area=length*width;
        System.out.println("Perimeter na pravougulnika: "+perimeter);
        System.out.println("Plosht na pravougulnika: "+area);
    }
    public static void calculateCircle(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Vuvedete radiusa na okruzhnostta: ");
        double r=scan.nextDouble();
        double perimeter=2*Math.PI*r;
        double area=Math.PI*r*r;
        System.out.println("Perimeter na okruzhnostta: "+perimeter);
        System.out.println("Plosht na okruzhnostta: "+area);
    }
    public static void calculatePolygon(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Vuvedete purva tochka x: ");
        double x1=scan.nextDouble();
        System.out.print("Vuvedete vtora tochka x: ");
        double x2=scan.nextDouble();
        System.out.print("Vuvedete purva tochka y: ");
        double y1=scan.nextDouble();
        System.out.print("Vuvedete vtora tochka y: ");
        double y2=scan.nextDouble();
        double perimeter=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1,2));
        double area=0;
        System.out.println("Perimeter na polygona: "+perimeter);
        System.out.println("Plosht na polygona: "+area);
        
    }
}
