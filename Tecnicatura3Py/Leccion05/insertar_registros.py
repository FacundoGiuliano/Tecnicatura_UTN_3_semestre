import psycopg2

conexion = psycopg2.connect(user = 'prueba', password = 'Prueba2022', host = '127.0.0.1', port = '5432', database = 'test_bd')
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'INSERT INTO persona(nombre, apellido, email)VALUES(%s,%s,%s)'
            valores = ("Carlos", "Lara", "clara@mail.com") # Es una tupla
            cursor.execute(sentencia, valores) # De esta manera ejecutamos la sentencia
            # conexion.commit() se utiliza para guardar los cambios en la bd
            registros_insertados = cursor.rowcount
            print(f'Los registros insertados son: {registros_insertados}')

except Exception as e:  
    print(f"Ocurrio un error: {e}")
finally:
    conexion.close()
