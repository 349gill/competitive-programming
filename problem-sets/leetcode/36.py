class Solution(object):
    def isValidSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: bool
        """
        for i in range(9):
            row = {1:0, 2:0, 3:0, 4:0, 5:0, 6:0, 7:0, 8:0, 9:0}
            col = {1:0, 2:0, 3:0, 4:0, 5:0, 6:0, 7:0, 8:0, 9:0}
            for j in range(9):
                if board[j][i] != ".":
                    col[int(board[j][i])] += 1
                    if col[int(board[j][i])] > 1:
                        return False
                if board[i][j] != ".":
                    row[int(board[i][j])] += 1
                    if row[int(board[i][j])] > 1:
                        return False

            for m in range(0, 9, 3):
                for n in range(0, 9, 3):
                    sub_box = {1:0, 2:0, 3:0, 4:0, 5:0, 6:0, 7:0, 8:0, 9:0}
                    for i in range(m, m + 3):
                        for j in range(n, n + 3):
                            if board[i][j] != ".":
                                sub_box[int(board[i][j])] += 1
                                if sub_box[int(board[i][j])] > 1:
                                    return False

        return True
        

