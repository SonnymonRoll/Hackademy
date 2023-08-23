Algoritmo Palindromo
	frase = ""
	Escribir "Ingrese la frase/palabra a probar en minúsculas:"
	Leer frase
	test = ""
	
	Para i = 1 Hasta Longitud(frase) Hacer
		Si Subcadena(frase, i, i) <> " " Entonces
			test = test + Subcadena(frase, i, i)
		FinSi
	FinPara
	
	bool = Verdadero
	len = Longitud(test)
	
	Para i = 1 Hasta Longitud(test) Hacer
		Si Subcadena(test, i, i) <> Subcadena(test, len, len) Entonces
			bool = Falso
		FinSi
		len = len - 1
	FinPara
	
	Si bool = Verdadero Entonces
		Escribir "La frase/palabra ", frase, " es un palíndromo"
	SiNo
		Escribir "La frase/palabra ", frase, " no es un palíndromo"
	FinSi
FinAlgoritmo
