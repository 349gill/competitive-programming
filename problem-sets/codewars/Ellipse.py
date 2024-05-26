def ellipse(a, b):
    import math
    ar = str(round(a*b*math.pi, 1))
    pm = str(round((math.pi*((3*(a+b)/2) - (a*b)**0.5)), 1))
    return "Area: " + ar + ', ' + 'perimeter: ' + pm
