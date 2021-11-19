

public class Main
{
    public static int calculateminFitness(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = (n-i) + sum;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        //each time we change the GenereticAlgorithm's constructor input, as well as the first parameter of the Chromosome run function.
        GeneticAlgorithm algorithm = new GeneticAlgorithm(13);
        //populationSize, mutationProbability, maximumSteps, minimumFitness
        Chromosome solution = algorithm.run(1000, 0.08, 100000, calculateminFitness(Chromosome.getQueens_number()));
        long end = System.currentTimeMillis();
        //TODO: Show the time needed for calculating the solution.
        solution.print();
        System.out.println("Search time:" + (double) (end-start)/1000 + "sec");//total time in seconds
    }
}
