from ManejoArchivos import ManejoArchivos

# Manejo de contexto with: sintaxis simplificada, abre y cierra el archivo
# with open("prueba.txt", "r", encoding="utf8") as archivo:
    # print(archivo.read())
# No hace falta ni el try, ni el finally
# En el contexto de with lo que se ejecuta de manera automatia son los metodos __enter__ y __exit__

with ManejoArchivos("prueba.txt") as archivo:
    print(archivo.read())

