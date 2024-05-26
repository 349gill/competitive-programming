# https://www.codewars.com/kata/530e15517bc88ac656000716

def rot13(message):
    encrypted = ""
    for i in message:
        if not i.isalpha():
            encrypted += i
        else:
            case = i.isupper()
            encrypted_letter = ord(i.lower()) + 13
            if encrypted_letter > ord('z'):
                encrypted_letter -= 26
            if case:
                encrypted += chr(encrypted_letter - 32)
            else:
                encrypted += chr(encrypted_letter)
    return encrypted