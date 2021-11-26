

public class Main
{
    public static int calculateminFitness(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = (n-i) + sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        int queens_number = Integer.parseInt(args[0]);
        int populationSize = Integer.parseInt(args[1]);
        double mutationprobability = Double.parseDouble(args[2]);
        int maxsteps = Integer.parseInt(args[3]);
        boolean testuntilnumber = Boolean.parseBoolean(args[4]);
        if (queens_number <= 3) {
            System.out.println("There is no solution for values less or equal to 3");
        } else if(testuntilnumber){
            for (int i = 4; i <= queens_number ; i++) {


                long start = System.currentTimeMillis();
                //each time we change the GenereticAlgorithm's constructor input, as well as the first parameter of the Chromosome run function.
                GeneticAlgorithm algorithm = new GeneticAlgorithm(i);
                //populationSize, mutationProbability, maximumSteps, minimumFitness
                Chromosome solution = algorithm.run(populationSize, mutationprobability, maxsteps, calculateminFitness(Chromosome.getQueens_number()));
                long end = System.currentTimeMillis();
                solution.print();
                System.out.println("For queens number: " + i + " ,population size: " + populationSize + " ,mutation probability: " + mutationprobability + " and max steps: " + maxsteps);
                System.out.println("Search time:" + (double) (end - start) / 1000 + "sec");//total time in seconds
            }

        }
        else if(!testuntilnumber){
            long start = System.currentTimeMillis();
            //each time we change the GenereticAlgorithm's constructor input, as well as the first parameter of the Chromosome run function.
            GeneticAlgorithm algorithm = new GeneticAlgorithm(queens_number);
            //populationSize, mutationProbability, maximumSteps, minimumFitness
            Chromosome solution = algorithm.run(populationSize, mutationprobability, maxsteps, calculateminFitness(Chromosome.getQueens_number()));
            long end = System.currentTimeMillis();
            solution.print();
            System.out.println("For queens number: " + queens_number + " ,population size: " + populationSize + " ,mutation probability: " + mutationprobability + " and max steps: " + maxsteps);
            System.out.println("Search time:" + (double) (end - start) / 1000 + "sec");//total time in seconds
        }
    }
}
