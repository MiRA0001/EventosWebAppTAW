package eventoswebapp.entity;

import eventoswebapp.entity.Evento;
import eventoswebapp.entity.UsuarioEventos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-08T20:12:20")
@StaticMetamodel(Reserva.class)
public class Reserva_ { 

    public static volatile SingularAttribute<Reserva, Integer> reservaId;
    public static volatile SingularAttribute<Reserva, Evento> eventoId;
    public static volatile SingularAttribute<Reserva, Integer> fila;
    public static volatile SingularAttribute<Reserva, Integer> asiento;
    public static volatile SingularAttribute<Reserva, UsuarioEventos> usuarioId;

}