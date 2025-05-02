def getMatrix(title):
    count_row = 0
    A = []

    print(f"===\n{title}\nType the row numbers separated by commas (e.g. 1, 2, 3)\nType 'end' to finish\n===")

    while True:
        user_input = input(f'row[{count_row}] : ').strip()
        
        if user_input.lower() == 'end':
            if len(A) == 0:
                print("Error: Matrix can't be empty.")
                return None
            else:
                break

        try:
            row = list(map(int, user_input.split(',')))
            if len(row) == 0:
                print("Error: Row can't be empty.")
                continue
            A.append(row)
            count_row += 1
        except:
            print("Error: Didn't follow the correct format.")
            return None

    return A

def isMatrix(A):
    if not A or not all(isinstance(row, list) for row in A):
        return False

    col_length = len(A[0])
    if col_length == 0:
        return False

    return all(len(row) == col_length for row in A)

def multiplyMatrix(A, B):
    if not (isMatrix(A) and isMatrix(B)): 
        return 'Error: A or B is not a valid matrix.'
    
    rowA, colA = len(A), len(A[0])  
    rowB, colB = len(B), len(B[0])

    if colA != rowB:
        return 'Error: cannot multiply A and B due to mismatched dimensions.'

    C = [[0 for _ in range(colB)] for _ in range(rowA)]

    for i in range(rowA):
        for j in range(colB):
            for k in range(colA):
                C[i][j] += A[i][k] * B[k][j]

    return C

def main():
    A = getMatrix('Matrix A')
    if A is None: return

    B = getMatrix('Matrix B')
    if B is None: return

    print('===')
    print('A =', A)
    print('B =', B)

    result = multiplyMatrix(A, B)
    print('AB =', result)

if __name__ == "__main__":
    main()
