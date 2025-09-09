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