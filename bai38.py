
def is_prime(number):
    if number <2:
        return False
    for i in range(2, number):
        if number % i == 0:
            return False
            exit()
    return True
def find_first_k_primes(k):
   
    primes = []  
    current_number = 2 

    while len(primes) < k:
        if is_prime(current_number)==True:
            primes.append(current_number)
        current_number += 1

    return primes
a=int(input())

    
result = find_first_k_primes(a)
print(" ".join(map(str, result)))
