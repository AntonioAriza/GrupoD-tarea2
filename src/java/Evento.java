import java.text.SimpleDateFormat;
import java.util.Date;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent; 
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.model.UploadedFile;

public class Evento {
 
    private String firstname;//titulo
    private String lastname;//tematica
    private Integer aforo;//aforo maximo
    private String street;//calle
    private String city;//ciudad
    private String localidad;
    private String postalCode;//codigo postal
    private String info;//informacion adicional
    private String email;//email
    private String phone;//telefono
    private Integer duracion;
    private Integer id;
    private Date date0;
    private Date date2;
    private Date date3;
    private Date date4;
    private Date date5;
    private UploadedFile file1,file2,file3,file4,file5,file6;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAforo() {
        return aforo;
    }

    public void setAforo(Integer aforo) {
        this.aforo = aforo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate0() {
        return date0;
    }

    public void setDate0(Date date0) {
        this.date0 = date0;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    public Date getDate3() {
        return date3;
    }

    public void setDate3(Date date3) {
        this.date3 = date3;
    }

    public Date getDate4() {
        return date4;
    }

    public void setDate4(Date date4) {
        this.date4 = date4;
    }

    public Date getDate5() {
        return date5;
    }

    public void setDate5(Date date5) {
        this.date5 = date5;
    }

    public UploadedFile getFile1() {
        return file1;
    }

    public void setFile1(UploadedFile file1) {
        this.file1 = file1;
    }

    public UploadedFile getFile2() {
        return file2;
    }

    public void setFile2(UploadedFile file2) {
        this.file2 = file2;
    }

    public UploadedFile getFile3() {
        return file3;
    }

    public void setFile3(UploadedFile file3) {
        this.file3 = file3;
    }

    public UploadedFile getFile4() {
        return file4;
    }

    public void setFile4(UploadedFile file4) {
        this.file4 = file4;
    }

    public UploadedFile getFile5() {
        return file5;
    }

    public void setFile5(UploadedFile file5) {
        this.file5 = file5;
    }

    public UploadedFile getFile6() {
        return file6;
    }

    public void setFile6(UploadedFile file6) {
        this.file6 = file6;
    }
    
    
    
    public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
    }
     
    public void click() {
        RequestContext requestContext = RequestContext.getCurrentInstance();
         
        requestContext.update("form:display");
        requestContext.execute("PF('dlg').show()");
    }
     
    public void upload1() {
        if(file1 != null) {
            FacesMessage message = new FacesMessage("Archivo ", file1.getFileName() + "subido con éxito.");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }
     
    public void upload2() {
        if(file2 != null) {
            FacesMessage message = new FacesMessage("Archivo ", file2.getFileName() + "subido con éxito.");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }
    
    public void upload3() {
        if(file3 != null) {
            FacesMessage message = new FacesMessage("Archivo ", file3.getFileName() + "subido con éxito.");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }
    
    public void upload4() {
        if(file4 != null) {
            FacesMessage message = new FacesMessage("Archivo ", file4.getFileName() + "subido con éxito.");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }
     
    public void upload5() {
        if(file5 != null) {
            FacesMessage message = new FacesMessage("Archivo ", file5.getFileName() + "subido con éxito.");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }
     
    public void upload6() {
        if(file6 != null) {
            FacesMessage message = new FacesMessage("Archivo ", file6.getFileName() + "subido con éxito.");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    } 
    
}