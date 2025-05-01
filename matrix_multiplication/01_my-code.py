'''
Matrix Multiplication
    Matrix A와 B의 곱인 AB 반환하기.

    행렬 곱셈 가능 조건
    A : m x n
    B : n x k

'''

def getMatrix(title):
    # row by row로 Martix 입력받기 | Args: (string) title of message | Return : Matrix A or None
    count_row = 0
    user_input = ''
    A = []

    print(f"=== \n{title} \nType the row numbers in the format: \ne.g.) 1, 2, 3\nType 'end' to finish \n===")

    while user_input != 'end':
        user_input = input(f'row[{count_row}] : ')
        if user_input == 'end':
            return A

        try:
            A.append(list(map(int, user_input.split(', '))))
            count_row += 1
        except:
            print("Error: didn't follow the format")
            return None
    
    return A

def isMatrix(A):
    # A가 Matrix 인지 판별 | Args: (list) 판별할 대상 A | Return : True or False
    rowA_len = len(A)
    colA_len = len(A[0])
    count_row = 0

    for i in range(rowA_len):
        if len(A[i]) == colA_len:
            count_row += 1
    
    if count_row == rowA_len:
        return True
    else:
        return False


def multiplyMatrix(A, B):
    # 두 Matrix의 곱 반환 | Args: (list) Matrix A, (list) Matrix B | Return : Matrix AB
    if not(isMatrix(A) & isMatrix(B)): 
        return 'A or B is not matrix'
    
    rowA_len = len(A)
    colA_len = len(A[0])  
    rowB_len = len(B)
    colB_len = len(B[0])
    C = []
    rowC = []
    c = 0
    

    if colA_len != rowB_len:
        return 'cannot multiply A and B'

    for rowA_index in range(rowA_len):
        for colB_index in range(colB_len):
            for rowB_index in range(rowB_len):
                c += A[rowA_index][rowB_index] * B[rowB_index][colB_index]
            rowC.append(c)
            c=0
        C.append(rowC)
        rowC = []
    
    if isMatrix(C):
        return C
    else:
        return 'multiplication failed'



def main(): 
    # A = [[1, 2, 3], [4, 5, 6]]
    # B = [[1, 2], [3, 4], [5, 6]]

    A = getMatrix('Matrix A')
    B = getMatrix('Matrix B')

    print('===')
    print('A = ', A)
    print('B = ', B)

    print('AB = ', multiplyMatrix(A, B))

main()