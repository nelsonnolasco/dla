package viagem;

import java.util.Scanner;
public class CustoViagem  // Custo da Viagem
// Este programa calcula o custo de abastecimento de uma viagem com base na distância, preço da gasolina e consumo do veículo.
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
	    System.out.println ("Digite a distância da Viagem em Km: ");
	    double distancia = sc.nextDouble ();
	    
	    System.out.println ("Digite o preço da gasolina: ");
	    double precoGasolina = sc.nextDouble ();
	    
	    double kmLitro = 12;
	    
	    double litrosGasolina = distancia/kmLitro;
	    
	    double custoAbastecimento = precoGasolina * litrosGasolina;
	    
	    System.out.println ("Serão necessários " + litrosGasolina + " litros para a viagem");
	    System.out.println ("O custo de abastecimento será de: R$"+ custoAbastecimento +".");
	    
	    sc.close ();
		
	}
}
// O programa calcula o custo de abastecimento de uma viagem com base na distância, preço da gasolina e consumo do veículo.