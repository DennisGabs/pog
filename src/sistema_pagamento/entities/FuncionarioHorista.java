package sistema_pagamento.entities;

import sistema_pagamento.entities.dto.FuncionarioDTO;

public class FuncionarioHorista extends FuncionarioDTO {

    private int horasTrabalhadas;
    private double valorHora;

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }
}
