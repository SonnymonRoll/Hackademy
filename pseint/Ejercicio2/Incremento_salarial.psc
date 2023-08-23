Algoritmo Incremento_salarial
	actual = 0
	Escribir "Ingrese su salario actual:"
	Leer actual
	inc = 0
	val = 0
	Si actual < 15000 Entonces
		val = 20
		inc = actual * 1.2
	SiNo
		val = 15
		inc = actual * 1.15
	FinSi
	Escribir "Su nuevo salario tendrá un incremento del ", val, "%, por lo que será de ", inc
FinAlgoritmo
