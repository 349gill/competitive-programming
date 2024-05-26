# https://www.codewars.com/kata/51689e27fe9a00b126000004

def format_words(words):
    outputString = str()
    if words is not None:
        words = list(filter(None, words))
        for i in range(0,len(words)):
            if i!=len(words)-1 and i!=0:
                outputString+=", "+words[i]
            elif i==0:
                outputString+=words[i]
            elif i==len(words)-1 and len(words)>1:
                outputString+=" and "+words[i]
    return outputString   