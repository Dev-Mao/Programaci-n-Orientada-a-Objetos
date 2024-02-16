# Definir las variables
horas_trabajadas = 48
tarifa_por_hora = 5000
porcentaje_retencion = 0.125

# Calcular salario bruto
salario_bruto = horas_trabajadas * tarifa_por_hora

# Calcular retención en la fuente
retencion_fuente = salario_bruto * porcentaje_retencion

# Calcular salario neto
salario_neto = salario_bruto - retencion_fuente

# Mostrar resultados
print("Salario bruto:", salario_bruto)
print("Retención en la fuente:", retencion_fuente)
print("Salario neto:", salario_neto)