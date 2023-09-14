##LLUVIA MARIANA GUTIERREZ INTERIAN##
#calcular el perimetro de un cuadrado
def ingresar():
    try:
        lado = float(input("Por favor, la medida en centimetro de un lado: \n"))
        return lado
    except ValueError: #por si el usuario ingresa algo que no es un numero
        print("Ese no es un numero, ingresa un número por favor.")
        return ingresar()
    
def formula(lado):
    peri=lado*4
    return peri
#-------------------- 
print('Vamos a calcular el perimetro de un cuadrado!!')
#llamar a las funciones
ingresar=ingresar()
peri=formula(ingresar)
#imprimir resultado
print("El perimetro es ",peri,"cm")