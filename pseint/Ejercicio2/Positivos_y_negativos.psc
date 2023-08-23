Algoritmo Positivos_y_negativos
	Dimension valores[10]
	Escribir "Ingrese 10 valores numéricos:"
	Para i = 1 Hasta 10 Hacer
		Leer valores[i]
	FinPara
	positivos = 0
	negativos = 0
	Para i = 1 Hasta 10
		Si valores[i] > 0 Entonces
			positivos = positivos + 1
		SiNo
			negativos = negativos + 1
		FinSi
	FinPara
	Escribir "Tienes ", positivos, " valores positivos y ", negativos, " valores negativos"
FinAlgoritmo
