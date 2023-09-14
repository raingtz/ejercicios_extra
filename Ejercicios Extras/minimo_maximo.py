##LLUVIA MARIANA GUTIERREZ INTERIAN##
#Encontrar minimo y maximo de una lista de numeros
import random

lista=[random.randint(1,500) for _ in range(20)] #crear lista random de 20 numeros de 1 a 500
print("Lista Generada Random: ",lista) #imprimir lista generada
mx=max(lista) #sacar maximo
mn=min(lista) #sacar minimo
print("Numero Minimo",mn,"Numero Maximo",mx) #imprimir resultados