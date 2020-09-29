
import java.util.Random;
public class SimulationDriver {

    public static void main(String[] args) {
            VotingService votingService = new MultipleChoiceQuestion("How many NBA titles will LeBron James have if he wins in 2020? 1, 2, 3, or 4?","1","2","3","4","4");
            Student[] students = new Student[10];
            Random random = new Random();
            for(int i =0; i<10; i++){
            students[i] = new Student(String.valueOf(i+1));
        }
            votingService.vote(students[0], "1");
            votingService.vote(students[1], "1");
            votingService.vote(students[2], "4");
            votingService.vote(students[3], "2");
            votingService.vote(students[4], "1");
            for(int i =5; i<10;i++) {
                int ans = random.nextInt(4) + 1;
                votingService.vote(students[i], String.valueOf(ans));
            }
         ((MultipleChoiceQuestion)votingService).getResults();


        votingService = new SingleChoiceQuestion("Did the Clippers make it to the 2020 NBA Finals?","T","F","F");
        Student student = new Student("100");
        Student studnt = new Student("101");

            votingService.vote(student,"F");
            votingService.vote(studnt, "T");
            votingService.vote(studnt, "T");


        ((SingleChoiceQuestion)votingService).getResults();

    }
}
