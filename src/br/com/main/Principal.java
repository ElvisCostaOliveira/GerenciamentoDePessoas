package br.com.main;

public class Principal {
    public static void main(String[] args) {
        Pessoa novaPessoa = new Pessoa();
        
        novaPessoa.setNome("Elvis");
        novaPessoa.setIdade(30);
        novaPessoa.setEstadoCivil("Solteiro");
        novaPessoa.setData("05/08/1985"); 
        novaPessoa.setCPF("000.000.000-00");
        novaPessoa.setRG("00.000.000-0"); 
        
        System.out.println("Novo Nome: " + novaPessoa.getNome());
        System.out.println("Nova Idade: " + novaPessoa.getIdade());
        System.out.println("Novo Estado Civil: " + novaPessoa.getEstadoCivil());
        System.out.println("Nova Data: " + novaPessoa.getData());
        System.out.println("Novo CPF: " + novaPessoa.getCPF());
        System.out.println("Novo RG: " + novaPessoa.getRG());
    }
}
