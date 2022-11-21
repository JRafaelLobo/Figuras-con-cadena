package com.mycompany.s6_arreglos_joselobo;

import java.util.Scanner;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Jr
 */
public class S6_Arreglos_JoseLobo {

    static Scanner leer = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("Menu");
            System.out.println("1-->Suma de elementos");
            System.out.println("2-->Suma de dos arreglos");
            System.out.println("3-->Suma alrevez");
            System.out.println("4-->Organizar cadena");
            System.out.println("5-->Convertir");
            System.out.println("6-->Figuras");
            System.out.println("8-->Salir");
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Su opcion"));

            System.out.println("Ingrese tamano de arreglo: ");
            int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño"));
            int[] numeros = new int[tam];
            numeros = lectura(tam);

            switch (opcion) {
                case 1 -> {
                    imprimir(numeros);
                    int respuesta = suma(numeros);
                    System.out.println("Su respuesta es: " + respuesta);
                }//case 1
                case 2 -> {
                    System.out.println("Arreglo 1: ");
                    imprimir(numeros);
                    int[] numeros2 = new int[tam];
                    numeros2 = lectura(tam);
                    System.out.println();
                    System.out.println("Arreglo 2: ");
                    imprimir(numeros2);
                    System.out.println("Resultados:");
                    imprimir(dossumas(numeros, numeros2));
                }//case 2
                case 3 -> {
                    System.out.println("Arreglo 1: ");
                    imprimir(numeros);
                    int[] numeros2 = new int[tam];
                    numeros2 = lectura(tam);
                    System.out.println("Arreglo 2: ");
                    imprimir(numeros2);
                    System.out.println("Resultados:");
                    imprimir(sumaopuesta(numeros, numeros2));
                }//case 3
                case 4 -> {
                    System.out.println("Original: ");
                    imprimir(numeros);
                    System.out.println("Organizado : ");
                    imprimir(organizar(numeros));
                }//case 4
                case 5 -> {
                    char[] ejemplo = new char[tam];
                    for (int i = 0; i < tam; i++) {
                        int codigoAscii = (int) Math.floor(Math.random() * (122 - 97) + 97);
                        ejemplo[i] = (char) codigoAscii;
                    }
                    System.out.println("Arreglo antes de la conversion");
                    imprimirchar(ejemplo);
                    System.out.println("Arreglo despues de la conversion");
                    char[] resp2 = cambiarcaracter(ejemplo);
                    imprimirchar(resp2);
                }//case 5
                case 6 -> {

                    imprimir(numeros);
                    boolean test = pares(numeros);
                    if (test == true) {
                        JFrame ventana = new JFrame("Bola de boliche");
                        Figuras objecto = new Figuras();
                        ventana.add(objecto);
                        ventana.setSize(700, 700);
                        ventana.setLocationRelativeTo(null);
                        ventana.setVisible(true);
                        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    } else {
                        JFrame ventana = new JFrame("Pokemon");
                        Segundafigura objecto = new Segundafigura();
                        ventana.add(objecto);
                        ventana.setSize(700, 700);
                        ventana.setLocationRelativeTo(null);
                        ventana.setVisible(true);
                        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }

                }//case 6
                case 7 -> {
                    JOptionPane.showInputDialog(null, "Salir");
                }//case 7
                default -> {
                    JOptionPane.showInputDialog(null, "Opcion Incorrecta");
                }//default
            }//switch
            System.out.println();
        } while (opcion != 7);
    }//main
    //Recibe un entero y retorna un arreglo de enteros

    public static int[] lectura(int tam) {
        int[] temporal = new int[tam];
        for (int i = 0; i < temporal.length; i++) {
            temporal[i] = 1 + random.nextInt(20);
        }//for
        return temporal;
    } //int parametro

    public static void imprimir(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }//for
        System.out.println();
    }//impromir

    public static void imprimirchar(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }//for
        System.out.println();
    }//impromir

    public static int suma(int[] arreglo) {
        int respuesta = 0;

        for (int i = 0; i < arreglo.length; i++) {
            respuesta += arreglo[i];
        }//for
        return respuesta;
    }//arreglo

    public static int[] dossumas(int a[], int b[]) {
        int[] temporal = new int[a.length];
        for (int i = 0; i < temporal.length; i++) {
            temporal[i] = a[i] + b[i];
        }//for
        return temporal;
    }//dossumas

    public static int[] sumaopuesta(int a[], int b[]) {
        int[] temporal = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            temporal[i] = a[i] + b[(a.length - 1) - i];
        }//for
        return temporal;
    }//sumaopuesta

    public static int[] organizar(int x[]) {
        int[] temporal = new int[x.length];
        int change = 0;
        for (int i = 0; i < x.length; i++) {
            int a = 19, b;
            for (int k = 0; k < x.length; k++) {
                b = x[k];
                if (b <= a) {
                    a = b;
                    change = k;
                }//if
            }//for k
            temporal[i] = a;
            x[change] = 20;
        }//for i
        return temporal;
    }//organizar

    public static char[] cambiarcaracter(char x[]) {
        char[] conversion = new char[x.length];
        int decision;
        do {
            System.out.println("Desea conversion a mayuscula (1) o a minuscula (2)");
            decision = leer.nextInt();
        } while (decision > 2 || decision < 1);
        for (int i = 0; i < x.length; i++) {
            String temporal = "";
            if (decision == 1) {
                temporal = Character.toString(x[i]).toUpperCase();
            } else {
                temporal = Character.toString(x[i]).toLowerCase();
            }
            char temp = temporal.charAt(0);
            conversion[i] = temp;
        }
        for (int i = 0; i < conversion.length; i++) {
            for (int j = 0; j < conversion.length; j++) {
                if ((int) conversion[i] > (int) conversion[j]) {
                    char temp = conversion[i];
                    conversion[i] = conversion[j];
                    conversion[j] = temp;
                }

            }
        }
        return conversion;
    }//organizacr caracter

    public static boolean pares(int[] a) {
        int par = 0, impar = 0;
        boolean temp;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                par += 1;
            } else {
                impar += 1;
            }
        }//for
        temp = par > impar;
        return temp;
    }//pares
}//class
