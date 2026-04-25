import random

magicNumber = random.randint(1,10)

def guessIsCorrect(number):
    """Determines wether or not the guessed number is the correct number.
    Prints a hint if the number is wrong and 'Correct', if the number is right.
    """
    if number == magicNumber:
        print("Correct.")
    elif number > magicNumber:
        print("Incorrect, guess lower.")
    else:
        print("Incorrect, guess higher.")
    return number == magicNumber

if __name__ == '__main__':
    userinput = int(input("Guess the number:"))
    while not guessIsCorrect(userinput):
        userinput = int(input("Guess the number:"))

