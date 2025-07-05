import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoas pessoas = new Pessoas();
        Estacionamento estacionamento = new Estacionamento();

        System.out.println("╔═════════════════════════════════════╗");
        System.out.println("║              BEM-VINDO!             ║");
        System.out.println("╚═════════════════════════════════════╝");

        // --- Menu Principal ---
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("--------------MENU-------------");
            System.out.println("Escolha uma opção abaixo:");
            System.out.println("1. Cadastrar proprietário.");
            System.out.println("2. Adicionar um veiculo.");
            System.out.println("3. Baixa de saida do veiculo.");
            System.out.println("4. Buscar veiculo.");
            System.out.println("5. Cadastrar vaga ao estacionamento.");
            System.out.println("6. Visualizar estacinamento.");
            System.out.println("0. Sair.");





            System.out.print("Sua opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine()); // Tenta converter a entrada para um número

                switch (opcao) {
                    case 1:
                        System.out.println("\n--- CADASTRO DE PROPRIETÁRIO ---");
                        System.out.print("Nome: ");
                        String nomePessoa = scanner.nextLine();

                        System.out.print("CPF: ");
                        String cpfPessoa = scanner.nextLine();

                        System.out.print("Telefone: ");
                        String telefonePessoa = scanner.nextLine();

                        System.out.print("Cidade: ");
                        String cidade = scanner.nextLine();

                        System.out.print("Sexo: ");
                        String sexoPessoa = scanner.nextLine();

                        Pessoa proprietarioCadastrado = new Pessoa(nomePessoa, sexoPessoa, cidade, telefonePessoa, cpfPessoa );
                        pessoas.adicionarPessoa(proprietarioCadastrado);
                        System.out.println("\nProprietário cadastrado com sucesso!");
                        System.out.println(proprietarioCadastrado);
                        System.out.println("----------------------------------------");
                        break;


                    case 2: // Opção para cadastrar Veículo
                        System.out.println("\n--- CADASTRO DE VEÍCULO ---");

                        System.out.print("Digite o CPF do proprietário do veículo: ");
                        String cpfProprietarioVeiculo = scanner.nextLine();
                        Pessoa proprietarioVeiculo = pessoas.buscarPessoaPorCpf(cpfProprietarioVeiculo);

                        if (proprietarioVeiculo == null) {
                            System.out.println("\nERRO: Proprietário com CPF '" + cpfProprietarioVeiculo + "' não encontrado.");
                            System.out.println("Por favor, certifique-se de cadastrar o proprietário primeiro (Opção 1).");
                            System.out.println("----------------------------------------");
                            break;
                        }

                        System.out.println("\nProprietário selecionado: " + proprietarioVeiculo.getNome() + " (CPF: " + proprietarioVeiculo.getCpf() + ")");
                        System.out.println("----------------------------------------");


                        System.out.println("Escolha o tipo de veículo para cadastrar:");
                        System.out.println("1. Carro");
                        System.out.println("2. Moto");
                        System.out.print("Sua opção: ");
                        int opcaoTipoVeiculo = Integer.parseInt(scanner.nextLine());

                        if (opcaoTipoVeiculo == 1) {
                            System.out.println("\n--- DETALHES DO CARRO ---");

                            System.out.print("Modelo do carro: ");
                            String modeloCarro = scanner.nextLine();

                            System.out.print("Cor do carro: ");
                            String corCarro = scanner.nextLine();

                            System.out.print("Ano do carro: ");
                            int anoCarro = Integer.parseInt(scanner.nextLine());

                            System.out.print("Hora de entrada (formato HH:MM, ex: 14:30): ");
                            String entradaHorario = scanner.nextLine();
                            String[] partesHorario = entradaHorario.split(":");

                            int horaEntrada = 0;
                            int minutosEntrada = 0;
                            boolean horarioValido = false;

                            if (partesHorario.length == 2) {
                                try {
                                    horaEntrada = Integer.parseInt(partesHorario[0]);
                                    minutosEntrada = Integer.parseInt(partesHorario[1]);
                                    if (horaEntrada >= 0 && horaEntrada <= 23 && minutosEntrada >= 0 && minutosEntrada <= 59) {
                                        horarioValido = true;
                                    } else {
                                        System.out.println("AVISO: Horário de entrada inválido. Digite entre 00:00 e 23:59.");
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("AVISO: Formato de hora/minuto inválido. Use apenas números.");
                                }
                            } else {
                                System.out.println("AVISO: Formato de horário incorreto. Use HH:MM.");
                            }

                            Carro carro = new Carro(horaEntrada, minutosEntrada, modeloCarro, corCarro, anoCarro, proprietarioVeiculo);
                            estacionamento.addVagaCarro(carro);
                            System.out.println(carro);



                        } else if (opcaoTipoVeiculo == 2) {
                            System.out.println("\n--- DETALHES DA MOTO ---");

                            System.out.print("Modelo da moto: ");
                            String modeloMoto = scanner.nextLine();

                            System.out.print("Cor: ");
                            String corMoto = scanner.nextLine();

                            System.out.print("Ano: ");
                            String anoMoto = scanner.nextLine();

                            System.out.print("Hora de entrada (formato HH:MM, ex: 14:30): ");
                            String entradaHorario = scanner.nextLine();
                            String[] partesHorario = entradaHorario.split(":");

                            int horaEntrada = 0;
                            int minutosEntrada = 0;
                            boolean horarioValido = false;

                            if (partesHorario.length == 2) {
                                try {
                                    horaEntrada = Integer.parseInt(partesHorario[0]);
                                    minutosEntrada = Integer.parseInt(partesHorario[1]);
                                    if (horaEntrada >= 0 && horaEntrada <= 23 && minutosEntrada >= 0 && minutosEntrada <= 59) {
                                        horarioValido = true;
                                    } else {
                                        System.out.println("AVISO: Horário de entrada inválido. Digite entre 00:00 e 23:59.");
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("AVISO: Formato de hora/minuto inválido. Use apenas números.");
                                }
                            } else {
                                System.out.println("AVISO: Formato de horário incorreto. Use HH:MM.");
                            }

                            Moto moto = new Moto(horaEntrada, minutosEntrada, modeloMoto, corMoto, anoMoto, proprietarioVeiculo);
                            estacionamento.addVagaMoto(moto);
                            System.out.println(moto);

                        } else {
                            System.out.println("Opção de veículo inválida.");
                        }
                        System.out.println("----------------------------------------");
                        break;
                    case 3:
                        System.out.println("\n--- SAIDA DO VEICULO ---");

                        System.out.print("CPF do proprietario: ");
                        String cpf = scanner.nextLine();
                        Vaga vaga = estacionamento.buscarVeiculo(cpf);

                        System.out.print("Valor por hora no estacionamento: ");
                        String entradaValor = scanner.nextLine();
                        float valorPorHora = Float.parseFloat(entradaValor);

                        System.out.print("Hora de saida(formato HH:MM, ex: 14:30): ");
                        String entradaHorario = scanner.nextLine();
                        String[] partesHorario = entradaHorario.split(":");

                        int horaSaida = 0;
                        int minutosSaida = 0;
                        boolean horarioValido = false;

                        if (partesHorario.length == 2) {
                            try {
                                horaSaida = Integer.parseInt(partesHorario[0]);
                                minutosSaida = Integer.parseInt(partesHorario[1]);
                                if (horaSaida >= 0 && horaSaida <= 23 && minutosSaida >= 0 && minutosSaida <= 59) {
                                    horarioValido = true;
                                } else {
                                    System.out.println("AVISO: Horário de saida inválido. Digite entre 00:00 e 23:59.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("AVISO: Formato de hora/minuto inválido. Use apenas números.");
                            }
                        } else {
                            System.out.println("AVISO: Formato de horário incorreto. Use HH:MM.");
                        }

                        if (vaga.getTipo() == "Carro") {
                            Carro c = vaga.getCarro();
                            c.baixaSaida(horaSaida, minutosSaida, vaga, valorPorHora);
                            estacionamento.removeVaga(vaga);
                        } else {
                            Moto m = vaga.getMoto();
                            m.baixaSaida(horaSaida, minutosSaida, vaga, valorPorHora);
                            estacionamento.removeVaga(vaga);
                        }

                        break;
                    case 4:
                        System.out.println("\n--- BUSCA DO VEICULO ---");

                        System.out.print("CPF do proprietario: ");
                        String cpf1 = scanner.nextLine();
                        Vaga vaga1 = estacionamento.buscarVeiculo(cpf1);
                        vaga1 = null;
                        break;

                    case 5:
                        System.out.println("\n--- CADASTRO DE VAGA ---");
                        System.out.println("1. Carro");
                        System.out.println("2. Moto");
                        System.out.print("Sua opção: ");
                        int opcaoTipo= Integer.parseInt(scanner.nextLine());

                        if(opcaoTipo == 1){
                            estacionamento.addVagaCarro();
                        } else if (opcaoTipo == 2) {
                            estacionamento.addVagaMoto();
                        } else {
                            System.out.println("Opcao invalida!");
                        }

                    case 6:
                        System.out.println(estacionamento);
                    break;

                    case 0:
                        System.out.println("\n"); // Pula uma linha
                        System.out.println("Obrigado por usar o programa!");
                        System.out.println("Até a próxima!");
                        System.out.println("----------------------------------------");
                        break;
                    default:
                        System.out.println("\nOpção inválida. Por favor, digite um número de 0 a 2.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("\nEntrada inválida. Por favor, digite um número.");
            }
        }

        scanner.close();
    }
}