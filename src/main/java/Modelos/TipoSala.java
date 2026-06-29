/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 * Tipo de sala dentro de una sede.
 * PREFERENCIAL: atiende condiciones preferenciales (discapacidad, embarazo, adulto mayor). Solo una por sede.
 * EMERGENCIA_CRITICA: atiende casos de peligro inminente de muerte. Solo una por sede.
 * NORMAL: atiende a los usuarios no preferenciales y no criticos.
 *
 * @author Brandon
 */
public enum TipoSala {
    PREFERENCIAL,
    EMERGENCIA_CRITICA,
    NORMAL
}
