##LLUVIA MARIANA GUTIERREZ INTERIAN##
#Conversion entre grados Celcius y Farenheit

def menu():
    print("Convertidor de Temperatura Celcius-Farenheit\n"
          "Selecciona un opcion:\n"
          "1-Celcius a Farenheit\n"
          "2-Farenheit a Celcius\n"
          "3-Salir")

def ingresar():
    try:
        numero = float(input("Por favor, ingresa la temperatura: \n"))
        return numero
    except ValueError: #por si el usuario ingresa algo que no es un numero
        print("Ese no es un numero, ingresa un número por favor.")
        return ingresar()
    
def cel(numero):
        temp=numero*1.8 + 32
        print("Temperatura en Farenheit es: ",temp)
        return temp
def faren(numero):
        temp=(numero-32)/1.8
        print("Temperatura en Celcius es: ",temp)
        return temp

while True:
    menu()
    op = int(input(""))
    if op==1:
        temp_cel=ingresar()
        cel(temp_cel)
    elif op==2:
        temp_faren=ingresar()
        faren(temp_faren)
    elif op==3:
        print("Salida")
        break
    else: print("Opcion no valida")

    

    




    
