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
public class OrtogonalNode {
    int row;
    int column;
    Vehicle vehicle;
    OrtogonalNode right;
    OrtogonalNode down;

    public OrtogonalNode(int row, int column, Vehicle vehicle) {
        this.row = row;
        this.column = column;
        this.vehicle = vehicle;
    }
}


