/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.miumg.fmontiel.controllers;

import gt.edu.miumg.fmontiel.models.Vehicle;

/**
 *
 * @author Trabajo
 */
public class OrtogonalMatrix {
    private OrtogonalNode head;

    public void insert(int row, int column, Vehicle vehicle) {
        OrtogonalNode newNode = new OrtogonalNode(row, column, vehicle);

        if (head == null) {
            head = newNode;
            return;
        }

        OrtogonalNode current = head;
        OrtogonalNode previous = null;

        while (current != null && (current.row < row || (current.row == row && current.column < column))) {
            previous = current;
            current = current.right;
        }

        if (previous == null) {
            newNode.right = head;
            head = newNode;
        } else {
            newNode.right = previous.right;
            previous.right = newNode;
        }
    }

    public Vehicle search(String data) {
        OrtogonalNode current = head;
        while (current != null) {
            Vehicle v = current.vehicle;
            if (v.getPlate().equalsIgnoreCase(data) || v.getColor().equalsIgnoreCase(data) ||
    v.getLine().equalsIgnoreCase(data) || v.getModel().equalsIgnoreCase(data) ||
    v.getOwner().equalsIgnoreCase(data))
{
                return v;
            }
            current = current.right;
        }
        return null;
    }

    public boolean delete(String plate) {
        OrtogonalNode current = head;
        OrtogonalNode previous = null;

        while (current != null) {
            if (current.vehicle.getPlate().equalsIgnoreCase(plate)){
                if (previous == null) {
                    head = current.right;
                } else {
                    previous.right = current.right;
                }
                return true;
            }
            previous = current;
            current = current.right;
        }

        return false;
    }

    public void display() {
        OrtogonalNode current = head;
        while (current != null) {
            System.out.println("[" + current.row + "," + current.column + "] -> " + current.vehicle);
            current = current.right;
        }
    }
}
