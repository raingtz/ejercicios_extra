##LLUVIA MARIANA GUTIERREZ INTERIAN##
#calcular el area de un circulo

import math

def ingresar():
    try:
        radio = float(input("Por favor, la medida en centimetro del radio: \n"))
        return radio
    except ValueError: #por si el usuario ingresa algo que no es un numero
        print("Ese no es un numero, ingresa un número por favor.")
        return ingresar()
    
def formula(radio):
    pi=math.pi
    area=pi*(radio**2)
    return area
#-------------------- 
print('Vamos a calcular el area de un circulo!!')
#llamar a las funciones
ingresar=ingresar()
area=formula(ingresar)
#imprimir resultado
print("El area es {:.2f} cm2".format(area))