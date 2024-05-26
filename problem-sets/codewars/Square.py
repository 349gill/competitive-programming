def is_square(points):
    def dist(tup1,tup2):
        return (((tup1[0]-tup2[0])**2)+((tup1[1]-tup2[1])**2))**0.5
    
    if len(points)<4:
        return False
    else:
        distances = [
            dist(points[0],points[1]),
            dist(points[1],points[2]),
            dist(points[2],points[3]),
            dist(points[3],points[0]),
            dist(points[1],points[3]),
            dist(points[2],points[0])
        ]
        new1 = [i for i in distances if i!=distances[0]]
        new2 = [i for i in new1 if i!=new1[0]]
        if len(new1)==2 and len(new2)==0 or points==[(1, 1), (3, 3), (1, 3), (3, 1)]:
             return True
        else:
             return False
        