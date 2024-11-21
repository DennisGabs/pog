package sistema_pagamento.app;

import sistema_pagamento.entities.dto.FuncionarioDTO;
import sistema_pagamento.entities.FuncionarioComissionado;
import sistema_pagamento.entities.FuncionarioComum;
import sistema_pagamento.entities.FuncionarioHorista;

import java.util.ArrayList;
import java.util.List;

public class TesteFuncionarios {
    public static void main(String[] args) {
        List<FuncionarioDTO> listFuncionarios = new ArrayList<>();

        FuncionarioComum funcionarioComum = new FuncionarioComum();
        funcionarioComum.setNome("Dennis Comum");
        funcionarioComum.setCpf("123");
        funcionarioComum.setSalarioMensal(3000.0);

        listFuncionarios.add(funcionarioComum);

        FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado();
        funcionarioComissionado.setNome("Dennis Comissionado");
        funcionarioComissionado.setCpf("456");
        funcionarioComissionado.setComissao(1000.0);
        funcionarioComissionado.setSalarioBase(4000.0);

        listFuncionarios.add(funcionarioComissionado);


        FuncionarioHorista funcionarioHorista = new FuncionarioHorista();
        funcionarioHorista.setNome("Dennis Horista");
        funcionarioHorista.setCpf("789");
        funcionarioHorista.setValorHora(1000);
        funcionarioHorista.setHorasTrabalhadas(6);

        listFuncionarios.add(funcionarioHorista);

        for(FuncionarioDTO funcionario : listFuncionarios){
            System.out.println(funcionario);
        }

    }
}
