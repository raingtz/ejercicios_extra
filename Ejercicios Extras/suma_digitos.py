##LLUVIA MARIANA GUTIERREZ INTERIAN##
#Sumar los digitos de un numero 

numero = input("Por favor, ingresa un grupo de numeros: \n")
suma_num=0
for num in numero:
    if num.isdigit():  # Verificamos si el carácter es un dígito
        suma_num += int(num)

print("La suma de los dígitos del número de teléfono es:", suma_num)
