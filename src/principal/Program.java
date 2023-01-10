package principal;

import java.util.Scanner;

import entities.Funcionario;
import repositories.FuncionarioRepository;

public class Program {

	public static void main(String[] args) {

		System.out.println(" *** CADASTRO DE FUNCIONARIOS *** ");

		//criando um objeto para a classe Funcionario
		Funcionario funcionario = new Funcionario();
		
		//classe para captura de dados atraves do console
		Scanner scanner = new Scanner(System.in);

		//preenchendo os dados do cliente
		System.out.print("Entre com o ID do funcionario......: ");
		funcionario.setIdFuncionario(Integer.parseInt(scanner.nextLine()));
		
		System.out.print("Entre com o nome do funcionario....: ");
		funcionario.setNome(scanner.nextLine());
		
		System.out.print("Entre com o CPF do funcionario.....: ");
		funcionario.setCpf(scanner.nextLine());
		
		System.out.print("Entre com a matrícula do funcionario: ");
		funcionario.setMatricula(scanner.nextLine());
		
		System.out.print("Entre com o salário do funcionario...: ");
		funcionario.setSalario(scanner.nextLine());

		// imprimindo os dados do funcionario no console
		System.out.println("\nDADOS DO FUNCIONARIO:\n");
		System.out.println("ID DO FUNCIONARIO..: " + funcionario.getIdFuncionario());
		System.out.println("NOME...............: " + funcionario.getNome());
		System.out.println("MATRICULA..........: " + funcionario.getMatricula());
		System.out.println("CPF................: " + funcionario.getCpf());
		System.out.println("SALARIO...........: " + funcionario.getSalario());
		
		//instanciando a classe FuncionarioRepository
		FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
		funcionarioRepository.exportarDados(funcionario);

	}
}
