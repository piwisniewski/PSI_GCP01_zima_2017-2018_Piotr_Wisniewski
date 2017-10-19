from random import choice
from numpy import array, dot, random

unit_step = lambda x: 0 if x < 0 else 1

""" 2 element to bias"""
training_data = [
    (array([0, 0, 1]), 0),
    (array([0 ,1, 1]), 1),
    (array([1, 0, 1]), 1),
    (array([1, 1, 1]), 1),
]

w = random.rand(3)
errors = []
"""wspolczynnik nauki, krok uczenia sie """
eta = 0.2
""" liczba iteracji nauki """
n = 40
iteration = 1
"""range zwraca iterator"""
for i in range(n):
    print("Test nr",iteration)
    """losowe wejscie"""
    x, expected = choice(training_data)
    print("Random input:")
    print(x)
    print(expected)
    """mnozenie obiektow"""
    result = dot(w, x)

    error = expected - unit_step(result)

    errors.append(error)

    w += eta * error * x
    iteration = iteration +1
print(" ")
for x, _ in training_data:
    result = dot(x, w)
    print("{}: {} -> {}".format(x[:2], result, unit_step(result)))

