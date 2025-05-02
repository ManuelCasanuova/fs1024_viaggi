package it.epicode.fs1024_viaggi.prenotazioni;


import it.epicode.fs1024_viaggi.dipendenti.Dipendente;
import it.epicode.fs1024_viaggi.viaggi.Viaggio;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Prenotazione {

    private Long id;
    private Long numeroPrenotazione;
    private Dipendente dipendente;
    private Viaggio viaggio;

}
