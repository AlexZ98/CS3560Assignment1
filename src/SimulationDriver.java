import java.util.Random;
public class SimulationDriver {

    public static void main(String[] args) {
            VotingService votingService = new MultipleChoiceQuestion("1","2","3","4");
            Student[] students = new Student[60];
            Random random = new Random();
            for(int i =0; i<60; i++){
            students[i] = new Student(String.valueOf(i+1));
            int num = random.nextInt(4)+1;
            votingService.poll(students[i], Integer.toString(num));
            if(i==59)
                ((MultipleChoiceQuestion) votingService).getResults();
        }
        votingService = new SingleChoiceQuestion("1","2");
        Student student = new Student("100");
        Student studnt = new Student("101");

            votingService.poll(student,"2");
            votingService.poll(studnt, "1");

        ((SingleChoiceQuestion)votingService).getResults();

    }
}
