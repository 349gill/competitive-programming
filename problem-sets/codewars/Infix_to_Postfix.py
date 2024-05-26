def to_postfix (infix):
    """Convert infix to postfix"""
    
    prec = {
        "+": 1,
        "-": 1,
        "*": 2,
        "/": 2,
        "^": 3,
        "(": -1,
        ")": -1,
    }
    
    associativity = {
        "+": "L",
        "-": "L",
        "/": "L",
        "*": "L",
        "^": "R"
    }
    
    result = ""
    stack = [] # End of the list refers to the top of the stack
    for i in infix:
        if i in [str(i) for i in range(10)]:
            result += i
        elif i == "(":
            stack.append(i)
        elif i == ")":
            while stack != [] and stack[-1] != "(":
                result += stack.pop()
            stack.pop()
        else:
            while stack != [] and (prec[i] < prec[stack[-1]] or (prec[i] == prec[stack[-1]] and associativity[i] == 'L')):
                result += stack.pop()
            stack.append(i)
            
    while stack != []:
        result += stack.pop()
        
    return result