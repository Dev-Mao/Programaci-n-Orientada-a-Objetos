import math
import random

# Generador de un radio aleatorio
radio = random.randint(0, 100)

# Calcula el área del círculo utilizando la fórmula: pi * radio^2
area = math.pi * radio**2

# Calcula la longitud de la circunferencia utilizando la fórmula: 2 * pi * radio
longitud_circunferencia = 2 * math.pi * radio

# Imprime los resultados
print("El radio del círculo es: ", radio)
print("El área del círculo es:", area)
print("La longitud de la circunferencia es:", longitud_circunferencia)
