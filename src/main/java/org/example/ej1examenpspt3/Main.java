package org.example.ej1examenpspt3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Random;
import java.util.Scanner;

// Clase principal que contiene el método principal para iniciar la aplicación.
public class Main {

    // Método principal para iniciar la aplicación.
    public static void main(String[] args) {
        // Lista observable para almacenar información sobre las URLs introducidas por el usuario.
        ObservableList<UrlInfo> urlList = FXCollections.observableArrayList();
        // Instancia del observador para descargar y comprimir ficheros.
        DownloaderAndZipper downloaderAndZipper = new DownloaderAndZipper();
        // Agregar el observador a la lista observable.
        urlList.addListener(downloaderAndZipper);

        // Scanner para leer la entrada del usuario desde la consola.
        Scanner sc = new Scanner(System.in);

        // Ciclo para solicitar URLs al usuario hasta que escriba "exit".
        while (true) {
            System.out.print("Introduce una URL (o 'exit' para salir): ");
            String url = sc.nextLine();

            // Salir del ciclo si el usuario escribe "exit".
            if ("exit".equalsIgnoreCase(url)) {
                break;
            }

            // Agregar la URL y un texto único a la lista observable.
            urlList.add(new UrlInfo(url, generarTexto()));
        }

        // Cerrar el Scanner después de utilizarlo.
        sc.close();
    }

    // Método para generar un texto único para cada URL introducida por el usuario.
    private static String generarTexto() {
        Random random = new Random();
        StringBuilder texto = new StringBuilder();
        // Generar un texto de 20 caracteres aleatorios utilizando letras minúsculas.
        for (int i = 0; i < 20; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a');
            texto.append(randomChar);
        }
        return texto.toString();
    }
}