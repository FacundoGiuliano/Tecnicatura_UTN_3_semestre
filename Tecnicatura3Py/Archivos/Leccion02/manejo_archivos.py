#  Declaramos una variable
try:
    archivo = open("prueba.txt", "w", encoding="UTF-8")  # w = write/escribir
    archivo.write("Los acentos son importantes para las palabras\n")
    archivo.write("como por ejemplo: acción, producción, ejecución\n")
    archivo.write("Programamos con diferentes tipos de archivos, ahora en txt. \n")
    archivo.write("Las letras son: w (escribir), r (read, leer), a (append, anexa), x (crea un archivo),\n")
    archivo.write("t (text), b (binary, archivos binarios), w+ (write and read), r+ (read and write\n")
    archivo.write("Saludos a todos los profes de la Tecnicatura\n")
    archivo.write("Con esto terminamos")
except Exception as e:
    print(e)
finally:  # siempre se ejecuta
    archivo.close()  # cerrar el archivo
# archivo.write("Todo quedo perfecto") esto es un error
