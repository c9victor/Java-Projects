import java.util.Scanner;

public class BallotRecount {
    private static int countA, countB, recountA, recountB;
    private static int totalVotes;
    private static StringMap map;

    public static void main(String[] args) { 
        countA = countB = recountA = recountB = totalVotes = 0;
        StringMap map = new StringMap();

        Scanner sc = new Scanner(System.in);
        
        totalVotes = sc.nextInt();
        sc.nextLine();
        while(sc.hasNext()) {
            String name = sc.nextLine();
            String candidate = sc.nextLine();
            
            //duplicate found
            if (map.find(name) != null) {
                StringNode s = map.find(name);
                
                if (!s.getValue().equals(candidate)) {
                    //if the name appears again, having a value of C lets us know their vote has already been invalidated.
                    if (!s.getValue().equals("C")) {
                        if (s.getValue().equals("A"))
                            recountA--;
                        else
                            recountB--;
                        map.find(name).setValue("C");
                    }
                }
                if (candidate.equals("A")) 
                    countA++;
                else 
                    countB++;
                
            } else {
            //duplicate not found
                map.insert(name, candidate);
                if (candidate.equals("A")) {
                    countA++;
                    recountA++;
                } else {
                    countB++;
                    recountB++;
                }
            }
        }
        checkWinner();
    }

    public static void checkWinner() {
        System.out.println("Before recount");
        System.out.println("Candidate A: " + countA);
        System.out.println("Candidate B: " + countB);
        
        System.out.println("\nAfter recount");
        System.out.println("Candidate A: " + recountA);
        System.out.println("Candidate B: " + recountB);
        
        if (recountA > recountB) 
            System.out.println("\nCandidate A wins");
        else if (recountA == recountB)
            System.out.println("\nIt is a tie");
        else
            System.out.println("\nCandidate B wins");
    }
}
