def duplicate_count(text):
    if len(text)==0:return 0
    else:
        repeated = str()
        text = text.lower()
        for i in text:
            if text.count(i)>1 and i not in repeated:
                repeated = repeated + i
        return len(repeated)