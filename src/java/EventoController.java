import java.io.Serializable;
import org.primefaces.event.FlowEvent;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class EventoController implements Serializable {
 
    private Evento event;
    private boolean skip;
     
    public EventoController(){
        this.event = new Evento();
    }
    
    public Evento getEvento() {
        return event;
    }
 
    public void setEvento(Evento event) {
        this.event = event;
    }
     
    public void save() {        
        FacesMessage msg = new FacesMessage("El evento '" + event.getFirstname() + "' ha sido creado con éxito.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        FacesMessage ms = new FacesMessage("Puedes ver o modificar tu evento en la seccion 'Mis Eventos' de tu perfil.");
        FacesContext.getCurrentInstance().addMessage(null, ms);
    }
     
    public boolean isSkip() {
        return skip;
    }
 
    public void setSkip(boolean skip) {
        this.skip = skip;
    }
     
    public String onFlowProcess(FlowEvent event) {
        if(skip) {
            skip = false;   //reset in case user goes back
            return "confirm";
        }
        else {
            return event.getNewStep();
        }
    }
}
