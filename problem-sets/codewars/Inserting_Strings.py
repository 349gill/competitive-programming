def insert_at_indexes(phrase, word, indexes): 
    for i in indexes: 
        phrase = phrase[:i+indexes.index(i)*len(word)] + word + phrase[i+indexes.index(i)*len(word):]
    return phrase