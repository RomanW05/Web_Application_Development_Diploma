def decimal_2_binary(number):
    decimal_in_binary = ''
    while True:
        modulus = number % 2
        number = number // 2
        decimal_in_binary += str(modulus)
        if number < 2:
            modulus = number % 2
            decimal_in_binary += str(modulus)
            return decimal_in_binary[::-1]


print(decimal_2_binary(5))