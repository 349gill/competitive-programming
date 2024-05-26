# https://www.codewars.com/kata/52b7ed099cdc285c300001cd

def sum_of_intervals(intervals):
    sorted_intervals = sorted(intervals)
    total_length = 0
    current_start, current_end = sorted_intervals[0]

    for start, end in sorted_intervals[1:]:
        if start <= current_end:
            current_end = max(current_end, end)
        else:
            total_length += current_end - current_start
            current_start, current_end = start, end

    total_length += current_end - current_start
    return total_length