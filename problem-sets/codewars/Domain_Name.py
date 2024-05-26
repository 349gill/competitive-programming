# https://www.codewars.com/kata/514a024011ea4fb54200004b

import re
def domain_name(url):
    pattern = r'(https?://)?(www\.)?([a-zA-Z0-9-]+)\.'
    matches = re.search(pattern, url)

    if matches:
        return matches.group(3)
    else:
        return None