def make_readable(seconds):
    secs = seconds % 60
    mins = seconds // 60
    hrs = min(mins // 60, 99)
    
    mins %= 60
    return f"{hrs:02}:{mins:02}:{secs:02}"