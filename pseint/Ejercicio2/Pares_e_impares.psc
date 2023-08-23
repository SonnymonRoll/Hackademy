Algoritmo Pares_e_impares
	Dimension valores[10]
	Escribir "Ingrese 10 valores numéricos:"
	Para i = 1 Hasta 10 Hacer
		Leer valores[i]
	FinPara
	pares = 0
	impares = 0
	Para i = 1 Hasta 10
		Si valores[i] % 2 = 0 Entonces
			pares = pares + 1
		SiNo
			impares = impares + 1
		FinSi
	FinPara
	Escribir "Tienes ", pares, " valores pares y ", impares, " valores impares"
FinAlgoritmo
