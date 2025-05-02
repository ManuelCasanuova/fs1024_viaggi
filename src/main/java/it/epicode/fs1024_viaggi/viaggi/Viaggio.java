package it.epicode.fs1024_viaggi.viaggi;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Viaggio {

    private LocalDate dataPartenza;
    private LocalDate dataRitorno;
    private String destinazione;
    private String descrizione;
}
