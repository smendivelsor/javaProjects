class Square:

    def __init__(self, lado):
        print("Creating square with side {L}".format(L = lado))
        self. lado = lado
    def perimetro(self) :
        return self.lado*4
    def area(self):
        return self.lado* self.lado

Square = Square(5)

print(Square.area())
print(Square.perimetro())