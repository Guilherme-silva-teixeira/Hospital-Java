package com.mycompany.aplicativo;

import java.util.List;
import java.util.ArrayList;

public class PacienteService {
    private List<Paciente> pacientes;

    public PacienteService() {
        this.pacientes = new ArrayList<>();
    }

    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public Paciente buscarPorCpf(String cpf) {
        for (Paciente p : pacientes) {
            if (p.getCpf().equals(cpf)) {
                return p;
            }
        }
        return null;
    }

    public List<Paciente> listarTodos() {
        return pacientes;
    }
}
