package eventoswebapp.entity;

import eventoswebapp.entity.Conversacion;
import eventoswebapp.entity.Estudio;
import eventoswebapp.entity.Evento;
import eventoswebapp.entity.Mensaje;
import eventoswebapp.entity.UsuarioEventos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-08T20:12:20")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> password;
    public static volatile ListAttribute<Usuario, Conversacion> conversacionList;
    public static volatile ListAttribute<Usuario, Conversacion> conversacionList1;
    public static volatile SingularAttribute<Usuario, UsuarioEventos> usuarioEventos;
    public static volatile ListAttribute<Usuario, Mensaje> mensajeList;
    public static volatile ListAttribute<Usuario, Evento> eventoList;
    public static volatile ListAttribute<Usuario, Estudio> estudioList;
    public static volatile SingularAttribute<Usuario, Integer> usuarioId;
    public static volatile SingularAttribute<Usuario, String> email;
    public static volatile SingularAttribute<Usuario, Integer> rol;
    public static volatile ListAttribute<Usuario, Mensaje> mensajeList1;

}