Algoritmo Num_dias_vividos
	Dimension fecha_nac[3]
	Dimension hoy[3]
	Escribir "Escriba su fecha de nacimiento en el siguiente orden: Día, mes (en número), año"
	Para i = 1 Hasta 3 Hacer
		Leer fecha_nac[i]
	FinPara
	Escribir "Escriba la fecha de hoy en el siguiente orden: Día, mes (en número), año"
	Para i = 1 Hasta 3 Hacer
		Leer hoy[i]
	FinPara
	dias_tot = 0
	Dimension meses[13]
	meses[1] = 31
	meses[2] = 28
	meses[3] = 31
	meses[4] = 30
	meses[5] = 31
	meses[6] = 30
	meses[7] = 31
	meses[8] = 31
	meses[9] = 30
	meses[10] = 31
	meses[11] = 30
	meses[12] = 31
	meses[13] = 0
	// Desglose años sin tomar en cuenta año actual y año de nacimiento:
	Para i = fecha_nac[3] + 1 Hasta hoy[3] - 1 Hacer
		Si i % 4 = 0 Entonces
			dias_tot = dias_tot + 366
		SiNo
			dias_tot = dias_tot + 365
		FinSi
	FinPara
	// Desglose año de nacimiento sin tomar en cuenta mes actual:
	Para i = fecha_nac[2] + 1 Hasta 13 Hacer
		Si i = 2 Entonces
			Si fecha_nac[3] % 4 = 0 Entonces
				dias_tot = dias_tot + meses[i] + 1
			SiNo
				dias_tot = dias_tot + meses[i]
			FinSi
		SiNo
			dias_tot = dias_tot + meses[i]
		FinSi
	FinPara
	// Desglose año actual sin tomar en cuenta mes actual:
	Si hoy[2] = 1 Entonces
		dias_tot = dias_tot
	SiNo
		Para i = 1 Hasta hoy[2] - 1 Hacer
			Si i = 2 Entonces
				Si hoy[3] % 4 = 0 Entonces
					dias_tot = dias_tot + meses[i] + 1
				SiNo
					dias_tot = dias_tot + meses[i]
				FinSi
			SiNo
				dias_tot = dias_tot + meses[i]
			FinSi
		FinPara
	FinSi
	// Desglose mes de nacimiento:
	Si fecha_nac[3] % 4 = 0 Entonces
		dias_tot = dias_tot + (meses[fecha_nac[2]] - fecha_nac[1]) + 1
	SiNo
		dias_tot = dias_tot + (meses[fecha_nac[2]] - fecha_nac[1])
	FinSi
	// Desglose mes actual:
	dias_tot = dias_tot + (hoy[1] - 1)
	Escribir "El número de días que has vivido es de:"
	Escribir dias_tot
FinAlgoritmo
