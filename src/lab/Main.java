package lab;
import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class Main {
    public static void best_season(Sesons s) {
        switch (s) {
            case Autumn -> System.out.println("Я люблю осень");
            case Spring -> System.out.println("Я люблю весну");
            case Summer -> System.out.println("Я люблю лето");
            case Winter -> System.out.println("Я люблю зиму");

        }

    }
    public static void main(String[] args) {
        Tester tester = new Tester();
        Point a = new Point(7, 5);
        Point a1 = new Point(4, 3);
        Circle b = new Circle(a, 7.3, "krasniy");
        Circle c = new Circle(a1, 2, "siniy");
        Circle d = new Circle(a1, 3, "green");
        Circle []mass = new Circle[3];
        mass[0]=b;
        mass[1]=c;
        mass[2]=d;

        for (int i=0;i<3;i++){
            tester.add(mass[i]);
            System.out.println(mass[i].toString());
        }

        System.out.println(tester.toString());
        Sesons[] t=Sesons.values();
        for(Sesons i:t){
            System.out.println(i + " " + i.getTemp());
            i.getDescription();
        }
        System.out.println("#1");
        Random rand = new Random();
        int arr[] = new int [10];
        for(int i = 0; i < arr.length;i ++)
        {
            arr[i] = rand.nextInt(100);
            System.out.println(arr[i]);
        }
        for(int i = 0; i < arr.length;i ++)
        {
            for(int j = 1; j < arr.length;j ++)
            {
                if (arr[j] > arr[j-1])
                {
                    int tem = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tem;
                }
            }
        }
        System.out.println("=========");
        for(int i = 0;i < arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("=========");
        for(int i = 0; i < arr.length;i ++)
        {
            double a2 = Math.random()*100;
            arr[i] = (int) a2;
            System.out.println(arr[i]);
        }
        for(int i = 0; i < arr.length;i ++)
        {
            for(int j = 1; j < arr.length;j ++)
            {
                if (arr[j] > arr[j-1])
                {
                    int tem = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tem;
                }
            }
        }
    }




}