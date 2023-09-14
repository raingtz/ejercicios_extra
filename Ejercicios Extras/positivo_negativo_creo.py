##LLUVIA MARIANA GUTIERREZ INTERIAN##
#Verificar si un numero es positivo, negativo o cero.

def ingresar():
    try:
        numero = float(input("Por favor, ingresa un numero: \n"))
        return numero
    except ValueError: #por si el usuario ingresa algo que no es un numero
        print("Ese no es un numero, ingresa un número por favor.")
        return ingresar()

def verificar(numero):
    if numero < 0:
        print("Numero es negativo")
    if numero > 0:
        print("Numero es positivo")
    if numero == 0:
        print("Numero es cero")
#------------
ingresar=ingresar()
verificar=verificar(ingresar)