class rectangle:

    def __init__(self, base ,altura):
        print("Creating rectangle with base {B} and height {H} ".format(B = base, H = altura))
        self. base = base
        self. altura = altura
      
    def perimetro(self) :
        return (self.base*2) + (self.altura*2)
      
    def area(self):
        return self.base * self.altura

rectangle = rectangle(6,4)

print("area cm²:",rectangle.area ())
print("perimeter cm :",rectangle.perimetro())