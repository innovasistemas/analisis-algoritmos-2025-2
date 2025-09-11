class operations:

    # Constructor
    def __init__(self) -> None:
        pass

    def sum_natural(self, n) -> int:
        s = 0
        for i in range(1, n + 1, 1):
            s += i
        return s
    
    def sum_naturals_gauss(self, n) -> int:
        return n * (n + 1) / 2
    
    def product(self, P) -> int:
        prod = 1
        for i in range(0, len(P), 1):
            prod *= P[i]
        return prod
    
    def factorial(self, n) -> int:
        f = 1
        for i in range(1, n + 1, 1):
            f *= i
        return f