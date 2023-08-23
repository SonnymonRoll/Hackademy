Algoritmo Ordenar_5_nums
	Dimension Nums[5]
	Escribir "Inserte 5 números"
	Leer Nums[1]
	Leer Nums[2]
	Leer Nums[3]
	Leer Nums[4]
	Leer Nums[5]
	temp = 0
	Para i = 1 Hasta 4 Hacer
		Para j = i + 1 Hasta 5 Hacer
			Si Nums[i] < Nums[j] Entonces
				temp = Nums[i]
				Nums[i] = Nums[j]
				Nums[j] = temp
			FinSi
		FinPara
	FinPara
	Escribir "Los números ordenados de mayor a menor son:"
	Para i = 1 Hasta 5 Hacer
		Escribir Nums[i]
	FinPara
FinAlgoritmo
