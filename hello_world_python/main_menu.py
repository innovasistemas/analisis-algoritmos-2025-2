from operations import operations

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

option = ""
oper = operations()
while option != "0":
    print("-" * 14)
    print(GREEN + "Menú principal" + WHITE)
    print("-" * 14)
    print("0. Finalizar")
    print("1. Sumatoria números naturales")
    print("2. Sumatoria números naturales Gauss")
    print("3. Productoria")
    print("4. Factorial")
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

        case _:
            print(f"{RED}Opción no válida{WHITE}")