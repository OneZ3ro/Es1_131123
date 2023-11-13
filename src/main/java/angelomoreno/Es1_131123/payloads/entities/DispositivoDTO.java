package angelomoreno.Es1_131123.payloads.entities;

import angelomoreno.Es1_131123.enums.StatoDispositivo;
import angelomoreno.Es1_131123.enums.TipoDispositivo;
import jakarta.validation.constraints.NotNull;

public record DispositivoDTO(
        @NotNull(message = "Lo stato del dispositivo è obbligatorio")
        TipoDispositivo tipoDispositivo,
        @NotNull(message = "Lo stato del dispositivo è obbligatorio")
        StatoDispositivo statoDispositivo,

        int utenteId
) {
}
