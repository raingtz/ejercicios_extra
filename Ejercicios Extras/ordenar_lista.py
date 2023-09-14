##LLUVIA MARIANA GUTIERREZ INTERIAN##
#Ordenar una lista de numeros en forma ascedente

import random

lista=[random.randint(1,50) for _ in range(15)] #crear lista random de 15 numeros de 1 a 50
print("Lista Generada Random: ",lista) #imprimir lista generada
orden=sorted(lista)
print("Lista ordenada",orden)