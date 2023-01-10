package repositories;

import java.io.PrintWriter;

import entities.Funcionario;

public class FuncionarioRepository {

	public void exportarDados(Funcionario funcionario) {

		try {

			// abrindo um arquivo para escrita (gravação)
			PrintWriter printWriter = new PrintWriter("c:\\temp\\funcionario_" + funcionario.getIdFuncionario() + ".txt");

			// escrevendo os dados do arquivo
			printWriter.write("\nID DO FUNCIONARIO: " + funcionario.getIdFuncionario());
			printWriter.write("\nNOME.............: " + funcionario.getNome());
			printWriter.write("\nMATRICULA........: " + funcionario.getMatricula());
			printWriter.write("\nSALARIO..........: " + funcionario.getSalario());
			printWriter.write("\nCPF..............: " + funcionario.getCpf());

			// salvando e fechando o arquivo
			printWriter.flush(); // salvar!
			printWriter.close(); // fechar!
			System.out.println("\nDados gravados com sucesso!");

		}

		catch (Exception e) {

			System.out.println("Falha ao gravar arquivo!");
			e.printStackTrace();
		}

	}

}
