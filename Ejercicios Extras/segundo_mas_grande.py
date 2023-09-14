##LLUVIA MARIANA GUTIERREZ INTERIAN##
#Encontrar el segundo numero mas grande de una lista

import random

lista=[random.randint(1,100) for _ in range(10)] #crear lista random de 10 numeros de 1 a 100
print("Lista Generada Random: ",lista) #imprimir lista generada
orden=sorted(lista,reverse=True) #ordenar de mayor a menor
print("Lista ordenada",orden)
segundo=orden[1] #escoger la posicion 1 de la lista, el segundo mas grande
print("Segundo numero mas grande ",segundo)