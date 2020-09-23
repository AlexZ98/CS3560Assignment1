
import java.util.Random;
public class SimulationDriver {

    public static void main(String[] args) {
            VotingService votingService = new MultipleChoiceQuestion("1","2","3","4");
            Student[] students = new Student[10];
            Random random = new Random();
            for(int i =0; i<10; i++){
            students[i] = new Student(String.valueOf(i+1));
        }
            votingService.poll(students[0], "1234");
            votingService.poll(students[1], "1");
            votingService.poll(students[2], "4");
            votingService.poll(students[3], "2");
            votingService.poll(students[4], "134");
            votingService.poll(students[5], "3");
            votingService.poll(students[6], "34");
            votingService.poll(students[7], "14");
            votingService.poll(students[8], "13");
            votingService.poll(students[9], "12");
         ((MultipleChoiceQuestion)votingService).getResults();


        votingService = new SingleChoiceQuestion("1","2");
        Student student = new Student("100");
        Student studnt = new Student("101");

            votingService.poll(student,"2");
            votingService.poll(studnt, "1");
            votingService.poll(student,"1");

        ((SingleChoiceQuestion)votingService).getResults();

    }
}
