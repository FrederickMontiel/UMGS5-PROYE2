/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.fmontiel.models;

import gt.edu.miumg.fmontiel.interfaces.CellClickListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 *
 * @author Trabajo
 */
public class CellPanel extends JPanel {

    private Vehicle vehicle;

    public CellPanel(boolean isOccupied) {
        setBackground(isOccupied ? Color.BLACK : Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.GRAY));
        setPreferredSize(new Dimension(30, 30));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (vehicle != null) {
                    Object[] opciones = {"Ver información", "Editar información", "Cancelar"};
                    int seleccion = JOptionPane.showOptionDialog(
                            null,
                            "¿Qué deseas hacer con este vehículo?",
                            "Opciones de Vehículo",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            opciones,
                            opciones[0]
                    );

                    switch (seleccion) {
                        case 0 -> mostrarInformacion();
                        case 1 -> editarVehiculo();
                        default -> {
                        }
                    }
                } else {
                    agregarVehiculo();
                }
            }
        });
    }

    private void mostrarInformacion() {
        JOptionPane.showMessageDialog(null,
                "Información del vehículo:\n\n" +
                        "Placa: " + vehicle.getPlate() + "\n" +
                        "Color: " + vehicle.getColor() + "\n" +
                        "Línea: " + vehicle.getLine() + "\n" +
                        "Modelo: " + vehicle.getModel() + "\n" +
                        "Propietario: " + vehicle.getOwner(),
                "Detalles del Vehículo",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private void agregarVehiculo() {
        String plate = JOptionPane.showInputDialog("Placa:");
        String color = JOptionPane.showInputDialog("Color:");
        String line = JOptionPane.showInputDialog("Línea:");
        String model = JOptionPane.showInputDialog("Modelo:");
        String owner = JOptionPane.showInputDialog("Propietario:");

        if (plate != null && !plate.trim().isEmpty()) {
            this.vehicle = new Vehicle(plate, color, line, model, owner);
            setBackground(Color.BLACK);
        }
    }

    private void editarVehiculo() {
        String plate = JOptionPane.showInputDialog("Placa:", vehicle.getPlate());
        String color = JOptionPane.showInputDialog("Color:", vehicle.getColor());
        String line = JOptionPane.showInputDialog("Línea:", vehicle.getLine());
        String model = JOptionPane.showInputDialog("Modelo:", vehicle.getModel());
        String owner = JOptionPane.showInputDialog("Propietario:", vehicle.getOwner());

        if (plate != null && !plate.trim().isEmpty()) {
            this.vehicle = new Vehicle(plate, color, line, model, owner);
            JOptionPane.showMessageDialog(null, "Datos actualizados correctamente.",
                    "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}