# CS3560Assignment1
Implement a program that allows students to vote on answer(s) to a given question type with candidate answers using OOP principles

NOTES: 
Made VotingService an interface with one method to handle the polling (in this program the polling collects the answers as well, implying that each student has to answer when polled in this simulation).
VotingService doesnt do much otherwise in my implementation, and the two Question classes (MultipleChoiceQuestion and SingleChoiceQuestion) handle the inputted answers taken from students and have their own HashMaps created on instantiation which allow me to manipulate the accumulators for each different answer.
I originally had a Question class but for my implementation it didn't make much sense because it was a pretty much empty abstract class that served no real purpose. I realize this might not 100% follow the guidelines provided but doing it this way made it easier for me to implement certain things like keeping track of an accumulator for how many times each answer was received.
