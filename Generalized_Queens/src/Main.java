

public class Main
{
    public static void main(String[] args)
    {
        //each time we change the GenereticAlgorithm's constructor input, as well as the first parameter of the Chromosome run function.
        GeneticAlgorithm algorithm = new GeneticAlgorithm(10);
        //populationSize, mutationProbability, maximumSteps, minimumFitness
        Chromosome solution = algorithm.run(10,1000, 0.08, 1000, 28);
        //TODO: Show the time needed for calculating the solution.
        solution.print();
    }
}
