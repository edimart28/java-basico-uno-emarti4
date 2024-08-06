import java.util.Scanner;

public class If_else {
        public static void main(String[] args) {

                int valorA;
                System.out.println("Ingresar valor A");
                Scanner scanner = new Scanner(System.in);
                valorA = scanner.nextInt();


                int valorB;
                System.out.println("Ingresar valor B");
                Scanner scanner1 = new Scanner(System.in);
                valorB = scanner.nextInt();

                int valorC;
                System.out.println("Ingresar valor C");
                Scanner scanner2 = new Scanner(System.in);
                valorC = scanner.nextInt();


                if (valorA > valorB && valorA > valorC && valorB > valorC) {
                        System.out.println("A es el numero mayor y C es el numero menor");

                } else if (valorA > valorB && valorA > valorC && valorB < valorC) {
                        System.out.println("A es el numero mayor y B es el numero menor");

                } else if (valorB > valorA && valorB > valorC && valorA > valorC) {
                        System.out.println("B es el numero mayor y C es el numero menor");

                } else if (valorB > valorA && valorB > valorC && valorA < valorC) {
                        System.out.println("B es el numero mayor y A es el numero menor");

                } else if (valorC > valorA && valorC > valorB && valorA > valorB) {
                        System.out.println("C es el numero mayor y B es el numero menor");

                } else if (valorC > valorA && valorC > valorB && valorA < valorB) {
                        System.out.println("C es el numero mayor y A es el numero menor");

                } else if (valorA == valorB | valorA == valorC | valorB == valorC) {
                        System.out.println("Digitaste valores repetidos, ingresalos nuevamente");

                }


                }
        }

