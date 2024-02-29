# Aplicación de Descarga y Compresión de Archivos desde URLs

Esta aplicación permite al usuario introducir URLs y luego procede a descargar los archivos correspondientes desde esas URLs.
Cada URL introducida se asocia con un texto único generado aleatoriamente. Una vez que el usuario ha terminado de introducir URLs,
la aplicación procede a comprimir todos los archivos descargados en un archivo ZIP.

Instrucciones de Uso:

Ejecución de la Aplicación:
Ejecute la clase Main para iniciar la aplicación.

Introducir URLs:
Cuando se le solicite, introduzca una URL por línea en la consola.
Escriba 'exit' para salir y proceder a la descarga y compresión de archivos.

Descarga y Compresión de Archivos:
Una vez que se ha introducido 'exit', la aplicación descargará los archivos desde las URLs especificadas.
Cada archivo descargado se comprimirá en un archivo ZIP.
El progreso de descarga y compresión se mostrará en la consola.

Estructura del Proyecto:
Main: Clase principal que inicia la aplicación y maneja la entrada del usuario.
DownloaderAndZipper: Clase que actúa como observador de cambios en la lista de URLs y maneja la lógica de descarga y compresión de archivos.
UrlInfo: Clase que representa información asociada a una URL, incluyendo la URL misma y un texto único generado aleatoriamente.

Requisitos:

Java 8 o superior
JavaFX (incluido en Java 8 hasta Java 10)
IDE de Java (por ejemplo, IntelliJ IDEA, Eclipse)

Notas Adicionales:
Asegúrese de tener una conexión a Internet activa para descargar los archivos desde las URLs especificadas.
Verifique la consola para ver los mensajes de progreso y cualquier error que pueda ocurrir durante el proceso de descarga y compresión.