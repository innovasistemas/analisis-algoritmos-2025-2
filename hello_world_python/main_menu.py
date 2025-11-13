import time
from operations import operations
from primes import primes
from random_numbers import RandomNumbers
from datetime import datetime

BLACK = '\033[30m'
RED = '\033[31m'
GREEN = '\033[32m'
YELLOW = '\033[33m' # orange on some systems
BLUE = '\033[34m'
MAGENTA = '\033[35m'
CYAN = '\033[36m'
LIGHT_GRAY = '\033[37m'
DARK_GRAY = '\033[90m'
BRIGHT_RED = '\033[91m'
BRIGHT_GREEN = '\033[92m'
BRIGHT_YELLOW = '\033[93m'
BRIGHT_BLUE = '\033[94m'
BRIGHT_MAGENTA = '\033[95m'
BRIGHT_CYAN = '\033[96m'
WHITE = '\033[97m'


def menu_primes():
    option = ""
    prime = primes()
    P = [2]

    while option != "0":
        print("-" * 14)
        print(GREEN + "Submenú primos" + WHITE)
        print("-" * 14)
        print("0. Regresar")
        print("1. Primos 1")
        print("2. Primos 2 (mejorado)")
        print("3. Primos 3 (más mejorado)")
        print("4. Primos 4 (mejorado++)")
        print("5. Nuevo primo Euclides")
        print("6. Nuevo primo sin Euclides")
        print("Ingrese su opción: ", end = "")
        option = input()
        match option:
            case "0":
                pass
            case "1":
                n = int(input("Ingrese un número natural: "))
                if n > 0 :
                    start = time.time()
                    if prime.prime_number(n):
                        print(f"{n} es primo")
                    else:
                        print(f"{n} no es primo")
                    end = time.time()
                    print(f"Tiempo inicial: {start}")
                    print(f"Tiempo final: {end}")
                    print(f"Tiempo ejecución: {end - start}")
                else:
                    print("Valor no válido para n")
            case "2":
                n = int(input("Ingrese un número natural: "))
                if n > 0 :
                    start = time.time()
                    if prime.prime_number2(n):
                        print(f"{n} es primo")
                    else:
                        print(f"{n} no es primo")
                    end = time.time()
                    print(f"Tiempo inicial: {start}")
                    print(f"Tiempo final: {end}")
                    print(f"Tiempo ejecución: {end - start}")
                else:
                    print("Valor no válido para n")
            case "3":
                n = int(input("Ingrese un número natural: "))
                if n > 0 :
                    start = time.time()
                    if prime.prime_number3(n):
                        print(f"{n} es primo")
                    else:
                        print(f"{n} no es primo")
                    end = time.time()
                    print(f"Tiempo inicial: {start}")
                    print(f"Tiempo final: {end}")
                    print(f"Tiempo ejecución: {end - start}")
                else:
                    print("Valor no válido para n")
            case "4":
                n = int(input("Ingrese un número natural: "))
                if n > 0 :
                    start = time.time()
                    if prime.prime_number4(n):
                        print(f"{n} es primo")
                    else:
                        print(f"{n} no es primo")
                    end = time.time()
                    print(f"Tiempo inicial: {start}")
                    print(f"Tiempo final: {end}")
                    print(f"Tiempo ejecución: {end - start}")
                else:
                    print("Valor no válido para n")
            case "5":
                print(f"Conjunto de primos actual: {P}")
                start = time.time()
                P.append(prime.new_prime_Euclides(P))
                print(f"Conjunto de primos con nuevo elemento: {P}")
                end = time.time()
                print(f"Tiempo inicial: {start}")
                print(f"Tiempo final: {end}")
                print(f"Tiempo ejecución: {end - start}")
            case "6":
                print(f"Conjunto de primos actual: {P}")
                start = time.time()
                P.append(prime.new_prime_without_Euclides(P))
                print(f"Conjunto de primos con nuevo elemento: {P}")
                end = time.time()
                print(f"Tiempo inicial: {start}")
                print(f"Tiempo final: {end}")
                print(f"Tiempo ejecución: {end - start}")
            case _:
                print(f"{RED}Opción no válida{WHITE}")




option = ""
oper = operations()
rand = RandomNumbers()
while option != "0":
    print("-" * 14)
    print(GREEN + "Menú principal" + WHITE)
    print("-" * 14)
    print("0. Finalizar")
    print("1. Sumatoria números naturales")
    print("2. Sumatoria números naturales Gauss")
    print("3. Productoria")
    print("4. Factorial")
    print("5. Números primos")
    print("6. Exponencial(x)")
    print("7. Números congruenciales (aleatorios)")
    print("Ingrese su opción: ", end = "")
    option = input()
    match option:
        case "0":
            print("Programa finalizado")
        case "1":
            n = int(input("Ingrese un número natural: "))
            if n > 0 :
                print(f"Suma de 1 a {n}: ", oper.sum_natural(n))
            else:
                print("Valor no válido para n")
        case "2":
            n = int(input("Ingrese un número natural: "))
            if n > 0 :
                print(f"Suma de 1 a {n}: ", oper.sum_naturals_gauss(n))
            else:
                print("Valor no válido para n")
        case "3":
            print(f"Productoria [2, 6, 7, 1]: {oper.product([2, 6, 7, 1])}")
        case "4":
            n = int(input("Ingrese un número entero positivo: "))
            if n >= 0 :
                print(f"{n}! = ", oper.factorial(n))
            else:
                print("Valor no válido para n")
        case "5":
            menu_primes()
        case "6":
            n = int(input("Ingrese un número entero positivo: "))
            if n >= 0 :
                x = float(input("Ingrese el número real x: "))
                print(f"exp({x})=", oper.exponential(n, x))
            else:
                print("Valor no válido para n")
        case "7":
                print(f"Generador de números congruenciales")
                now = datetime.now()
                rand.random_number(10, datetime.timestamp(now), 7 ** 5, 0, 2 ** 31 -1)
        case _:
            print(f"{RED}Opción no válida{WHITE}")

