from operations import operations

class primes:
    # Constructor
    def __init__(self) -> None:
        pass

    def prime_number(self, n) -> bool:
        i = 2
        sw = True # n es primo
        while i < n and sw:
            if n % i == 0:
                sw = False
            else:
                i += 1
        return sw
    
    def prime_number2(self, n) -> bool:
        i = 2
        sw = True # n es primo
        while i <= n / 2 and sw:
            if n % i == 0:
                sw = False
            else:
                i += 1
        return sw
    
    def prime_number3(self, n) -> bool:
        i = 2
        sw = True # n es primo
        while i <= n ** 0.5 and sw:
            if n % i == 0:
                sw = False
            else:
                i += 1
        return sw
    
    def prime_number4(self, n) -> bool:
        if n == 2:
            sw = True
        elif n % 2 == 0:
            sw = False 
        else:
            i = 3
            sw = True # n es primo
            while i <= n ** 0.5 and sw:
                if n % i == 0:
                    sw = False
                else:
                    i += 2
        return sw
    
    def new_prime_Euclides(self, P) -> int:
        oper = operations()
        x = oper.product(P)
        y = x + 1
        d = 2 
        while y % d != 0:
            d += 1
        return d
    
    def new_prime_without_Euclides(self, P) -> int:
        d = max(P) + 1
        while not self.prime_number4(d): 
            d = d + 1
        return d