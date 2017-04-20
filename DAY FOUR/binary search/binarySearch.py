class BinarySearch(list):
    
    def __init__(self, num1, num2):
        self.num1 = num1
        self.num2 = num2
        for i in range(1, num1 + 1):
            self.append(i * num2)
            self.length = len(self)

    def search(self, target):
        self.sort()
        left = 0
        right = self.length - 1
        count = 0
        while 1:
            middle = (left + right) // 2
            if left > right or middle > right:
                return {'count': count, 'index': -1}

            if self[middle] == target:
                return {'count': count, 'index': middle}

            elif self[right] == target:
                return {'count': count, 'index': right}

            elif self[left] == target:
                return {'count': count, 'index': left}

            elif middle == left or middle == right:
                return {'count': count, 'index': -1}

            elif self[middle] < target:
                left = middle + 1

            elif self[middle] > target:
                right = middle - 1
            count += 1
