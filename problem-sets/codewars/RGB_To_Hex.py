def rgb(r, g, b):
    r = max(0, min(255, round(r)))
    g = max(0, min(255, round(g)))
    b = max(0, min(255, round(b)))
    return '{:02X}{:02X}{:02X}'.format(r, g, b)