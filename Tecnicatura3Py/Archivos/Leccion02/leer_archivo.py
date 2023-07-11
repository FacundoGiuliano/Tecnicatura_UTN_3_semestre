
archivo = open("prueba.txt", "r", encoding="utf-8")
# print(archivo.read())
# print(archivo.read(5))
# print(archivo.read(5))  # Continuamos desde la linea anterior.
# print(archivo.readline())
# print(archivo.readline())
# C:\Users\Facundo\Tecnicatura3\Tecnicatura3Py\Archivos\Leccion02\prueba.txt Direccion del archivo

# vamos a iterar el archivo, cada una de las lineas
# for linea in archivo:
    # print(linea) iteramos todos los elementos del archivo
# print(archivo.readlines()[3]) # accedemos al archivo como si fuese una lista

# Anexamos informacion, copiamos a otro
archivo2 = open("copia.txt", "a", encoding="utf8")
archivo2.write(archivo.read())
archivo.close()  # cerramos el primer archivo
archivo2.close()  # cerramos la opia

print("Se ha terminado el proceso de leer y copiar archivos")
