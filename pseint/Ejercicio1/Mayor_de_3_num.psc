Algoritmo Mayor_de_3_num
	Dimension Nums[3]
	Escribir "Inserte 3 números"
	Leer Nums[1]
	Leer Nums[2]
	Leer Nums[3]
	Num_mayor = 0
	Para i = 1 Hasta 3 Hacer
		Si Nums[i] > Num_mayor Entonces
			Num_mayor = Nums[i]
		FinSi
	FinPara
	Escribir "El número más grande es el siguiente:"
	Escribir Num_mayor
FinAlgoritmo
