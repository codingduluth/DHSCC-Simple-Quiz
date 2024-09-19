def simple_quiz():
    score = 0

    # Question 1
    print("Question 1: What is the capital of France?")
    print("a) Madrid")
    print("b) Berlin")
    print("c) Paris")
    print("d) Rome")
    answer1 = input("Your answer: ").lower()
    if answer1 == "c":
        score += 1
        print("Correct!\n")
    else:
        print("Wrong! The correct answer is 'c) Paris'.\n")

    # Question 2
    print("Question 2: What is 5 + 7?")
    print("a) 10")
    print("b) 12")
    print("c) 13")
    print("d) 15")
    answer2 = input("Your answer: ").lower()
    if answer2 == "b":
        score += 1
        print("Correct!\n")
    else:
        print("Wrong! The correct answer is 'b) 12'.\n")

    # Question 3
    print("Question 3: Which planet is known as the Red Planet?")
    print("a) Earth")
    print("b) Mars")
    print("c) Jupiter")
    print("d) Venus")
    answer3 = input("Your answer: ").lower()
    if answer3 == "b":
        score += 1
        print("Correct!\n")
    else:
        print("Wrong! The correct answer is 'b) Mars'.\n")

    # Show final score
    print(f"Quiz over! Your final score is: {score}/3")

# Call the function to run the quiz
simple_quiz()
