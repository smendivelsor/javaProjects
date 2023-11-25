class Circle:
    pi = 3.14
    def __init__(self, diameter):
        print("Creating circle with diameter {d}".format(d=diameter))
        self.radius = diameter / 2
    def circumference(self) :
        return 2*self.pi*self.radius
    def area(self):
        return self.pi*self.radius**2
medium_pizza = Circle(12)
teaching_table = Circle(36)
round_room = Circle(11460)
print(medium_pizza.circumference())
print(teaching_table.circumference())
print(round_room.circumference())
print(medium_pizza.area())
print(teaching_table.area())
print(round_room.area())
