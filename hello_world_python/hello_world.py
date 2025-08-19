import math

name = "Ana"
lastName = " Gil"
fullName = name + lastName
print("Hola, esto es Python")
print("Nombre: " + fullName)
print(f"Su nombre interpolado es {fullName}")

if "A" < "a":
    print("A mayúscula es menor que a minúscula")
else:
    print("a mayúscula es menor que A minúscula")

if "z" < "a":
    print("z es menor que a")
else:
    print("a es menor que z")

x = False
print(f"x={x}")

print("2^10=", 2 ** 10)
print("5^3=", math.pow(5, 3))
print("RaízCuadrada(64)=" + str(math.sqrt(64)))
print("|-5|=", abs(-5))
