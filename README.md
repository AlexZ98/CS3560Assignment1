# CS3560Assignment1
Implement a program that allows students to vote on answer(s) to a given question type with candidate answers using OOP principles

Note: Made VotingService an interface with one method to handle the polling (in this program the polling collects the answers as well, implying that each student has to answer when polled in this simulation).
VotingService doesnt do much otherwise in my implementation, and the two Question classes (MultipleChoiceQuestion and SingleChoiceQuestion) handle the inputted answers taken from students and have their own HashMaps created on instantiation which allow me to manipulate the accumulators for each different answer.
I originally had a Question class but for my implementation it didn't make much sense because it was a pretty much empty abstract class that served no real purpose. I realize this might not 100% follow the guidelines provided but as I worked more and more on the project I found that the way I implemented the classes and features worke better with what logic I had in mind.
