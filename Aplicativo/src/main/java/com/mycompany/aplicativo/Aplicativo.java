package com.mycompany.aplicativo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Aplicativo
{
    public static void main(String[] args)
    {
        PrimeiraPagina pagina1 = new PrimeiraPagina();
        pagina1.setVisible(true);
        pagina1.setTitle("Hospital");
        pagina1.setLocationRelativeTo(null);
        //Hospital hospital = new Hospital("Hospital Professor Magalhães Neto","Rua Rio de Contas 302 Brumado-BA","Hospital.bru@gov.br","123456789");
        //System.out.println(hospital.toString());
        //Paciente paciente = new Paciente(null, null, null, null, null);
        //System.out.println(paciente.toString());
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PrimeiraPagina mainPage = new PrimeiraPagina();
                new CadastroPaciente(mainPage).setVisible(true);
            }
        });
    }
}