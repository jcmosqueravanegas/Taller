import java.util.Scanner;

public class Taller {

    public static Scanner cam = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void punto1() {
        System.out.print("Ingrese el valor de <N>: ");
        int N = cam.nextInt();

        int[] numeros = new int[N];
        int suma = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = cam.nextInt();
            suma += numeros[i];
        }
        System.out.println("La suma de los números ingresados es: " + suma);
    }

    public static void punto2() {

        System.out.print("Ingrese la cantidad de empleados (N): ");
        int N = cam.nextInt();

        double[] sueldo = new double[N];
        double[] asignaciones = new double[N];
        double[] deducciones = new double[N];
        double[] netoPagar = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.println("\nEmpleado " + (i + 1) + ":");
            System.out.print("Ingrese el sueldo base: ");
            sueldo[i] = cam.nextDouble();

            System.out.print("Ingrese las asignaciones: ");
            asignaciones[i] = cam.nextDouble();

            System.out.print("Ingrese las deducciones: ");
            deducciones[i] = cam.nextDouble();

            netoPagar[i] = sueldo[i] + asignaciones[i] - deducciones[i];
        }

        System.out.println("\nResumen de pagos:");
        for (int i = 0; i < N; i++) {
            System.out.print("Empleado " + (i + 1) + "sueldo: " + sueldo[i] + "Asignaciones: " + asignaciones[i]
                    + "Deduciones: " + deducciones[i] + "Neto: " + netoPagar[i]);
        }

    }

    public static void punto3() {
        System.out.print("Ingrese la cantidad de números: ");
        int N = cam.nextInt();

        int[] numeros = new int[N];
        int sumaPares = 0, sumaImpares = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = cam.nextInt();
            if (numeros[i] % 2 == 0) {
                sumaPares += numeros[i];
            } else {
                sumaImpares += numeros[i];
            }
        }

        System.out.println("\nSuma de los números pares: " + sumaPares);
        System.out.println("\nSuma de los números impares: " + sumaImpares);

    }

    public static void punto4() {

        System.out.print("Ingrese la cantidad de personas en el primer grupo: ");
        int N1 = cam.nextInt();
        int[] grupo1 = new int[N1];

        System.out.print("Ingrese la cantidad de personas en el segundo grupo: ");
        int N2 = cam.nextInt();
        int[] grupo2 = new int[N2];

        int mayorEdad = 0;

        for (int i = 0; i < N1; i++) {
            System.out.print("Ingrese la edad de la persona " + (i + 1) + " del primer grupo: ");
            grupo1[i] = cam.nextInt();
            if (grupo1[i] > mayorEdad) {
                mayorEdad = grupo1[i];
            }
        }

        for (int i = 0; i < N2; i++) {
            System.out.print("Ingrese la edad de la persona " + (i + 1) + " del segundo grupo: ");
            grupo2[i] = cam.nextInt();
            if (grupo2[i] > mayorEdad) {
                mayorEdad = grupo2[i];
            }
        }

        System.out.println("\nLa mayor edad registrada es: " + mayorEdad);
    }

    public static void punto5() {

        System.out.print("Ingrese la cantidad de productos distintos (N): ");
        int N = cam.nextInt();
        cam.nextLine();

        String[] descripcion = new String[N];
        double[] precioUnitario = new double[N];
        int[] cantidadComprada = new int[N];
        double[] totalGasto = new double[N];

        double totalGeneral = 0;
        double mayorGasto = 0.0;
        String productoMayorGasto = "";

        for (int i = 0; i < N; i++) {
            System.out.print("\nIngrese la descripción del producto " + (i + 1) + ": ");
            descripcion[i] = cam.nextLine();

            System.out.print("Ingrese el precio unitario de " + descripcion[i] + ": ");
            precioUnitario[i] = cam.nextDouble();

            System.out.print("Ingrese la cantidad comprada de " + descripcion[i] + ": ");
            cantidadComprada[i] = cam.nextInt();
            cam.nextLine();

            totalGasto[i] = precioUnitario[i] * cantidadComprada[i];

            totalGeneral += totalGasto[i];

            if (totalGasto[i] > mayorGasto) {
                mayorGasto = totalGasto[i];
                productoMayorGasto = descripcion[i];
            }
        }

        System.out.println("\nResumen de Compras:");
        for (int i = 0; i < N; i++) {
            System.out.println("Producto: " + descripcion[i] + " - Total gastado: $" + totalGasto[i]);
        }

        System.out.println("\nTotal general de todas las compras: $" + totalGeneral);
        System.out.println("El producto con mayor gasto es: " + productoMayorGasto + " con $" + mayorGasto);
    }

    public static void punto6() {

        System.out.print("Ingrese la cantidad de viviendas administradas (N): ");
        int N = cam.nextInt();

        double[] alquileres = new double[N];
        double[] porcentajes = new double[N];
        double[] ganancias = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("\nIngrese el alquiler mensual de la vivienda " + (i + 1) + ": ");
            alquileres[i] = cam.nextDouble();

            System.out.print("Ingrese el porcentaje de ganancia para la vivienda " + (i + 1) + ": ");
            porcentajes[i] = cam.nextDouble();

            ganancias[i] = (alquileres[i] * porcentajes[i]) / 100;
        }

        System.out.println("\nResumen de ganancias por vivienda:");
        for (int i = 0; i < N; i++) {
            System.out.println("Vivienda " + (i + 1) + " - Alquiler: $" + alquileres[i] +
                    " - Porcentaje: " + porcentajes[i] + "%" +
                    " - Ganancia: $" + ganancias[i]);
        }
    }

    public static void punto7() {

        int[] A = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];
        int contadorPares = 0, contadorImpares = 0;

        System.out.println("Ingrese 10 números para el arreglo A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            A[i] = cam.nextInt();

            if (A[i] % 2 == 0) {
                pares[contadorPares] = A[i];
                contadorPares++;
            } else {
                impares[contadorImpares] = A[i];
                contadorImpares++;
            }
        }

        System.out.println("\nNúmeros pares:");
        for (int i = 0; i < contadorPares; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\nNúmeros impares:");
        for (int i = 0; i < contadorImpares; i++) {
            System.out.print(impares[i] + " ");
        }
    }

    public static void punto8() {

        int[] numeros = new int[30];
        int mayor = 0;
        int menor = 0;
        int contadorMayor = 0;
        int contadorMenor = 0;

        System.out.println("Ingrese 30 números:");
        for (int i = 0; i < 30; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = cam.nextInt();

            if (numeros[i] > mayor) {
                mayor = numeros[i];
                contadorMayor = 1;
            } else if (numeros[i] == mayor) {
                contadorMayor++;
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
                contadorMenor = 1;
            } else if (numeros[i] == menor) {
                contadorMenor++;
            }
        }

        System.out.println("\nNúmero mayor: " + mayor + " (Repetido " + contadorMayor + " veces)");
        System.out.println("\nNúmero menor: " + menor + " (Repetido " + contadorMenor + " veces)");
    }

    public static void punto9() {

        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int N = cam.nextInt();
        int[] arreglo = new int[N];

        System.out.println("Ingrese los " + N + " números:");
        for (int i = 0; i < N; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo[i] = cam.nextInt();
        }

        System.out.print("Ingrese el número a buscar en el arreglo: ");
        int numeroABuscar = cam.nextInt();

        int contador = 0;
        for (int i = 0; i < N; i++) {
            if (arreglo[i] == numeroABuscar) {
                contador++;
            }
        }

        System.out.println("El número " + numeroABuscar + " se encuentra " + contador + " veces en el arreglo.");
    }

    public static void punto10() {

        System.out.print("Ingrese la cantidad de elementos del arreglo A: ");
        int N = cam.nextInt();
        int[] A = new int[N];

        System.out.println("Ingrese los " + N + " elementos del arreglo A:");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = cam.nextInt();
        }

        int[] B = new int[N / 2];
        for (int i = 0; i < N / 2; i++) {
            B[i] = A[i] + A[N - 1 - i];
        }

        System.out.print("\nArreglo A: ");
        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.print("\nArreglo B: ");
        for (int i = 0; i < N / 2; i++) {
            System.out.print(B[i] + " ");
        }
    }

    public static void punto11() {
        System.out.print("Ingrese la cantidad de elementos del arreglo A: ");
        int N = cam.nextInt();
        int[] A = new int[N];

        System.out.println("Ingrese los " + N + " elementos del arreglo A:");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = cam.nextInt();
        }

        int[] negativos = new int[N];
        int[] ceros = new int[N];
        int[] positivos = new int[N];

        int contNeg = 0, contCero = 0, contPos = 0;

        for (int i = 0; i < N; i++) {
            if (A[i] < 0) {
                negativos[contNeg] = A[i];
                contNeg++;
            } else if (A[i] == 0) {
                ceros[contCero] = A[i];
                contCero++;
            } else {
                positivos[contPos] = A[i];
                contPos++;
            }
        }

        System.out.print("\nArreglo Negativos: ");
        for (int i = 0; i < contNeg; i++) {
            System.out.print(negativos[i] + " ");
        }

        System.out.print("\nArreglo Ceros: ");
        for (int i = 0; i < contCero; i++) {
            System.out.print(ceros[i] + " ");
        }

        System.out.print("\nArreglo Positivos: ");
        for (int i = 0; i < contPos; i++) {
            System.out.print(positivos[i] + " ");
        }
    }

    public static void Punto12() {
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = cam.nextInt();

        if (n <= 0) {
            System.out.println("El tamaño del arreglo debe ser mayor que 0.");
            return;
        }

        int[] A = new int[n];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = cam.nextInt();
        }

        System.out.print("Ingrese el valor X a buscar en el arreglo: ");
        int x = cam.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] == x) {
                count++;
            }
        }

        int[] B = new int[count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] == x) {
                B[index++] = i + 1;
            }
        }

        System.out.print("Posiciones del valor " + x + " en el arreglo: ");
        imprimirArreglo(B);

        cam.close();
    }

    public static void imprimirArreglo(int[] arr) {
        if (arr.length == 0) {
            System.out.println("El valor no se encontró en el arreglo.");
        } else {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void Punto13() {

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = cam.nextInt();

        if (n <= 0) {
            System.out.println("El tamaño del arreglo debe ser mayor que 0.");
            return;
        }

        int[] A = new int[n];
        double suma = 0;

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = cam.nextInt();
            suma += A[i];
        }

        double media = suma / n;
        System.out.println("Media del arreglo: " + media);

        int countMayores = 0, countMenores = 0;
        for (int num : A) {
            if (num > media) {
                countMayores++;
            } else if (num < media) {
                countMenores++;
            }
        }

        int[] mayores = new int[countMayores];
        int[] menores = new int[countMenores];

        int iMayores = 0, iMenores = 0;
        for (int num : A) {
            if (num > media) {
                mayores[iMayores++] = num;
            } else if (num < media) {
                menores[iMenores++] = num;
            }
        }

        System.out.print("Elementos mayores que la media: ");
        imprimirArreglo(mayores);

        System.out.print("Elementos menores que la media: ");
        imprimirArreglo(menores);

    }

    public static void Punto14() {
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = cam.nextInt();

        if (n < 2) {
            System.out.println("El arreglo debe tener al menos dos elementos.");
            return;
        }

        int[] A = new int[n];
        int[] B = new int[n - 1];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = cam.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            B[i] = A[i] - A[i + 1];
        }

        System.out.print("Arreglo resultante B: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }

    }

    public static void Punto15() {

    }

    public static void Punto16() {

        System.out.print("Ingrese el número de profesores (N): ");
        int n = cam.nextInt();
        cam.nextLine(); 

        String[] nombres = new String[n];
        int[] edades = new int[n];
        char[] sexos = new char[n];

        System.out.println("\nIngrese la información de los profesores:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nProfesor " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombres[i] = cam.nextLine();

            System.out.print("Edad: ");
            edades[i] = cam.nextInt();
            cam.nextLine(); 

            System.out.print("Sexo (M/F): ");
            sexos[i] = cam.nextLine().charAt(0);
        }

        int sumaEdades = 0;
        for (int edad : edades) {
            sumaEdades += edad;
        }
        double edadPromedio = (double) sumaEdades / n;
        System.out.printf("\nEdad promedio del grupo de profesores: %.2f\n", edadPromedio);

        int indiceMasJoven = 0;
        for (int i = 1; i < n; i++) {
            if (edades[i] < edades[indiceMasJoven]) {
                indiceMasJoven = i;
            }
        }
        System.out.println("Nombre del profesor más joven: " + nombres[indiceMasJoven]);

        int indiceMayorEdad = 0;
        for (int i = 1; i < n; i++) {
            if (edades[i] > edades[indiceMayorEdad]) {
                indiceMayorEdad = i;
            }
        }
        System.out.println("Nombre del profesor con mayor edad: " + nombres[indiceMayorEdad]);

        int contProfesorasMayorPromedio = 0;
        for (int i = 0; i < n; i++) {
            if (sexos[i] == 'F' && edades[i] > edadPromedio) {
                contProfesorasMayorPromedio++;
            }
        }
        System.out.println("Número de profesoras con edad mayor al promedio: " + contProfesorasMayorPromedio);

        int contProfesoresMenorPromedio = 0;
        for (int i = 0; i < n; i++) {
            if (edades[i] < edadPromedio) {
                contProfesoresMenorPromedio++;
            }
        }
        System.out.println("Número de profesores con edad menor al promedio: " + contProfesoresMenorPromedio);

    }
}
