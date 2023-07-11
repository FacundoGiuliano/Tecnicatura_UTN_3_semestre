from NumerosIgualesException import NumerosIgualesException

resultado = None

try:
    a = int(input("Digite un numero: "))
    b = int(input("Digite un numero: "))
    if a == b:
        raise NumerosIgualesException("Son numeros iguales")  # Permite arrojar un excepcion
    resultado = a/b  # Modificamos
except TypeError as e:
    print(f"TypeError - Ocurrio un error: {type(e)}")
except ZeroDivisionError as e:
    print(f"ZeroDivisionError - Ocurrio un error: {type(e)}")
except Exception as e:
    print(f"Exception - Ocurrio un error: {type(e)}")
else:
    print("No se arrojo ninguna excepion")
finally:  # Siempre se va a ejecutar
    print("Ejecucion de este bloque finally")


print(f"El resultado es: {resultado}")
print("seguimos...")
