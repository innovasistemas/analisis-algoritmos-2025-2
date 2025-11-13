class RandomNumbers:
    # Constructor
    def __init__(self) -> None:
        pass

    def random_number(self, n, x0, a, b, m) -> None:
        X = []
        U = []
        X.append(x0)
        for i in range(1, n, 1):
            X.append((a * X[i - 1] + b) % m)
            U.append(X[i] / m)
        print(X)
        print(U)
        
            
        
