package org.example.ej1examenpspt3;

import javafx.collections.ListChangeListener;

// Clase que actúa como observador de cambios en la lista de URLs y maneja la descarga y compresión de ficheros.
class DownloaderAndZipper implements ListChangeListener<UrlInfo> {

    // Método llamado cuando se detectan cambios en la lista de URLs.
    @Override
    public void onChanged(Change<? extends UrlInfo> change) {
        // Iterar sobre los cambios detectados.
        while (change.next()) {
            // Verificar si se han añadido elementos a la lista.
            if (change.wasAdded()) {
                // Iterar sobre los elementos añadidos.
                for (UrlInfo addedUrlInfo : change.getAddedSubList()) {
                    // Obtener la URL y el texto único asociado al elemento añadido.
                    String url = addedUrlInfo.getUrl();
                    String uniqueString = addedUrlInfo.getCadenaTexto();

                    // Comprobar si la URL está vacía.
                    if (url.isEmpty()) {
                        System.out.println("Se va a proceder a descargar y comprimir los ficheros");
                    } else {
                        // Mostrar la URL y el texto único asociado.
                        System.out.println(url + " encolado como " + uniqueString);
                    }
                }
            }
        }
    }
}