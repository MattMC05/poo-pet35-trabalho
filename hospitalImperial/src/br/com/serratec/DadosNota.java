package br.com.serratec;

import java.util.Scanner;

import br.com.serratec.Classes.Fatura;
import br.com.serratec.Classes.NotaFiscal;
import br.com.serratec.persistence.FaturaDao;
import br.com.serratec.persistence.NotaDao;

public class DadosNota {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Integer id;

            System.out.print("Qual opção deseja?\n1 - Inserir nota\n2 - Visualizar nota\nInsira o número correspondente: ");
            Integer opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    var fDao = new FaturaDao();
            
                    System.out.print("Insira o ID da fatura que deseja: ");
                    id = sc.nextInt();
                    Fatura fatura = fDao.dadosFatura(id);
                    try {
                        var nDao = new NotaDao();
                        NotaFiscal nota = new NotaFiscal(1, "Hospital Imperial", "Operações do Hospital", fatura);
                        System.out.println(nota);
                        nDao.inserir(nota);
                    }catch (Exception e) {
                        System.err.println("Fatura inexistente ou status com pendência");
                    }
                break;
                case 2:
                    var nDao = new NotaDao();
                    System.out.print("Insira o ID da nota que deseja visualizar: ");
                    id = sc.nextInt();
                    if (nDao.dadosNota(id)!=null) {
                        System.out.println(nDao.dadosNota(id));
                    }else{
                        System.err.println("Nota inexistente");
                    }
                break;
            
                default:
                    System.out.println("Programa Finalizado");
                break;
            }

            sc.close();
    }
}
