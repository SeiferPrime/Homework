import java.util.Scanner;
class Toplivo{
	Scanner in = new Scanner(System.in);
	double S = in.nextDouble();
	double V = in.nextDouble();
	double Cost = in.nextDouble();
	double K = (V * 100) / S ;
	double Cost1 = (V * Cost) / S;
}