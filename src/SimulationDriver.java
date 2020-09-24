
import java.util.Random;
public class SimulationDriver {

    public static void main(String[] args) {
            VotingService votingService = new MultipleChoiceQuestion("1","2","3","4");
            Student[] students = new Student[10];
            Random random = new Random();
            for(int i =0; i<10; i++){
            students[i] = new Student(String.valueOf(i+1));
        }
            votingService.vote(students[0], "1234");
            votingService.vote(students[1], "1");
            votingService.vote(students[2], "4");
            votingService.vote(students[3], "2");
            votingService.vote(students[4], "134");
            int ans = random.nextInt(4)+1;
            votingService.vote(students[5], String.valueOf(ans));
            votingService.vote(students[6], String.valueOf(ans));
            votingService.vote(students[7], String.valueOf(ans));
            votingService.vote(students[8], String.valueOf(ans));
            votingService.vote(students[9], String.valueOf(ans));
         ((MultipleChoiceQuestion)votingService).getResults();


        votingService = new SingleChoiceQuestion("1","2");
        Student student = new Student("100");
        Student studnt = new Student("101");

            votingService.vote(student,"2");
            votingService.vote(studnt, "1");


        ((SingleChoiceQuestion)votingService).getResults();

    }
}
