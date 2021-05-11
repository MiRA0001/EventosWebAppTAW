package eventoswebapp.entity;

import eventoswebapp.entity.Etiqueta;
import eventoswebapp.entity.Reserva;
import eventoswebapp.entity.Usuario;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-08T20:12:20")
@StaticMetamodel(Evento.class)
public class Evento_ { 

    public static volatile SingularAttribute<Evento, String> descripcion;
    public static volatile SingularAttribute<Evento, Date> fechaEvento;
    public static volatile SingularAttribute<Evento, Integer> aforo;
    public static volatile SingularAttribute<Evento, Integer> eventoId;
    public static volatile SingularAttribute<Evento, Integer> maximoEntradasPorUsuario;
    public static volatile SingularAttribute<Evento, Boolean> entradasNumeradas;
    public static volatile ListAttribute<Evento, Etiqueta> etiquetaList;
    public static volatile SingularAttribute<Evento, Date> hora;
    public static volatile SingularAttribute<Evento, String> titulo;
    public static volatile SingularAttribute<Evento, Integer> asientosPorFila;
    public static volatile SingularAttribute<Evento, BigDecimal> precio;
    public static volatile SingularAttribute<Evento, Date> fechaMaximaReserva;
    public static volatile SingularAttribute<Evento, Integer> filas;
    public static volatile ListAttribute<Evento, Reserva> reservaList;
    public static volatile SingularAttribute<Evento, Usuario> creadorId;

}