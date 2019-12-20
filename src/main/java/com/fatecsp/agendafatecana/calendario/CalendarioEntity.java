package com.fatecsp.agendafatecana.calendario;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CalendarioEntity
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CalendarioEntity {

    private String id;
    private Integer ano;
    private Integer semestre;
    private List<Mes> meses;
}