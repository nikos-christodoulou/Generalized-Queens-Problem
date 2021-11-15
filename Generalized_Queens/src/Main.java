

public class Main
{
    public static void main(String[] args)
    {

        GeneticAlgorithm algorithm = new GeneticAlgorithm(9); // GeneticAlgorithm algorithm = new GeneticAlgorithm(n);, where n=queens_number
        //populationSize, mutationProbability, maximumSteps, minimumFitness
        Chromosome solution = algorithm.run(1000, 0.08, 1000, 28);
        solution.print();
    }
}
