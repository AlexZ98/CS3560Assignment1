# CS3560Assignment1
Implement a program that allows students to vote on answer(s) to a given question type with candidate answers using OOP principles

NOTES: 
Made VotingService an interface with one method to handle the polling (in this program the polling collects the answers as well, implying that each student has to answer when polled in this simulation).
VotingService doesnt do much otherwise in my implementation, and the two Question classes (MultipleChoiceQuestion and SingleChoiceQuestion) handle the inputted answers taken from students and have their own HashMaps created on instantiation which allow me to manipulate the accumulators for each different answer.

