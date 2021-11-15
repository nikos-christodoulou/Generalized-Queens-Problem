

public class Main
{
    public static void main(String[] args)
    {
        //each time we change the GenereticAlgorithm's constructor input, as well as the first parameter of the Chromosome run function.
        GeneticAlgorithm algorithm = new GeneticAlgorithm(4);
        //populationSize, mutationProbability, maximumSteps, minimumFitness
        Chromosome solution = algorithm.run(4,1000, 0.08, 1000, 28);
        solution.print();
    }
}
