# https://www.codewars.com/kata/520b9d2ad5c005041100000f
def pig_it(text):
    text = text.split()
    pig_latin_array = []
    for word in text:
        if word.isalpha():
            pig_latin_array.append(word[1:] + word[:1] + "ay")
        else:
            pig_latin_array.append(word)
            
    return " ".join(pig_latin_array)