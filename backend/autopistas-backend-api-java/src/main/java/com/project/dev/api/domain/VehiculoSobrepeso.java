/*
 * @fileoverview    {VehiculoSobrepeso} se encarga de realizar tareas específicas.
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementación realizada.
 * @version 2.0     Documentación agregada.
 */
package com.project.dev.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO: Definición de {@code VehiculoSobrepeso}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
@Entity
@Table(name = "\"VehiculoSobrepeso\"")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class VehiculoSobrepeso implements Serializable {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Long intIdRepeso;
    private Integer intPesoMaximo;
    private Integer intDiferenciaPeso;
    @Column(length = 8)
    private String strPlacaVehiculo;
    private Boolean bitBorrado;
    @JoinColumn(name = "intIdDinamica", referencedColumnName = "intIdDinamica")
    private Long intIdDinamica;

}
