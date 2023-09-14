##LLUVIA MARIANA GUTIERREZ INTERIAN##
#Verificar si es un año bisiesto

def ingresar():
    try:
        dias = float(input("Por favor, ingresa cuantos dias totales tiene febrero este año: \n"))
        return dias
    except ValueError: #por si el usuario ingresa algo que no es un numero
        print("Ese no es un numero, ingresa un número por favor.")
        return ingresar()
    
dias=ingresar()
if dias==29:
    print("Año bisiesto")
elif dias == 28:
    print("Año no bisiesto")
else: print("Eso ya no es un mes de febrero")
