

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
        //each time we change the GenereticAlgorithm's constructor input, as well as the first parameter of the Chromosome run function.
        GeneticAlgorithm algorithm = new GeneticAlgorithm(7);
        System.out.println(Chromosome.getQueens_number());
        //populationSize, mutationProbability, maximumSteps, minimumFitness
        Chromosome solution = algorithm.run(1000, 0.08, 20000, calculateminFitness(Chromosome.getQueens_number()));
        //TODO: Show the time needed for calculating the solution.
        solution.print();
    }
}
