class operations:

    # Constructor
    def __init__(self) -> None:
        pass

    def sum_natural(self, n) -> int:
        s = 0
        for i in range(1, n + 1, 1):
            s += i
        return s