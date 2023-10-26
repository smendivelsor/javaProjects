class Triangle:

    def __init__(self, cateto_opuesto, hipotenusa, cateto_adyacente):
        print("Creating triangle with cateto_opuesto {CO}, hipotenusa {H}, and cateto_adyacente {CA}".format(CO=cateto_opuesto, H=hipotenusa, CA=cateto_adyacente))
        self.cateto_opuesto = cateto_opuesto
        self.hipotenusa = hipotenusa
        self.cateto_adyacente = cateto_adyacente

    def perimetro(self):
        return self.cateto_opuesto + self.cateto_adyacente + self.hipotenusa

    def area(self):
        return (self.cateto_opuesto * self.cateto_adyacente) / 2

triangle = Triangle(3, 12, 4)

print("area cm²:", triangle.area())
print("perímetro cm:", triangle.perimetro())
