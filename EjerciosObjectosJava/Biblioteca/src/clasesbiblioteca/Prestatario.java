package clasesbiblioteca;

public class Prestatario extends General {
    private String direccion;
    private String telefono;
    private String ruc;
    private Ciudad ciudad;

    public Prestatario() {
    }

    public Prestatario(int cod, String nom, String dir, String tel, String ruc, Ciudad ciudad) {
        super(cod, nom);
        this.direccion = dir;
        this.telefono = tel;
        this.ruc = ruc;
        this.ciudad = ciudad;
    }

    public void setDireccion(String dir) {
        this.direccion = dir;
    }

    public void setTelefono(String tel) { // Corregido nombre del método
        this.telefono = tel;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getRuc() {
        return ruc;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return "Prestatario{" + "Dirección: " + direccion + ", Teléfono: " + telefono + ", RUC: " + ruc + ", Ciudad: " + ciudad + super.toString() + '}';
    }
}

/*package clasesbiblioteca;

public class Prestatario extends General{
    private String direccion;
    private String telefono;
    private String ruc; 
    private Ciudad ciudad;    
    
    
    public Prestatario(){


    }
    public Prestatario(int cod, String nom, String dir, String tel, String ruc, Ciudad ciudad){
        super(cod, nom);
        this.direccion = dir;
        this.telefono = tel;
        this.ruc = ruc;
        this.Ciudad = ciudad;

    }

    public void setDireccion(String dir){
        this.direccion = dir;

    }
    public void settelefono(String tel){
        this.telefono = tel;
        
    }
    public void setRuc(String ruc){
        this.ruc = ruc;
        
    }
    public void setCiudad(Ciudad ciudad){
        this.ciudad = ciudad;
        
    }


    public String getDireccion(){
        return direccion;

    }
    public String getTelefono(){
        return telefono;

    }
    public String getRuc(){
        return ruc;

    }
    public Ciudad getCiudad(){
        return ciudad;

    }
        public String toString(){
            return "prestatario{"+"Direccion " + direccion + ", telefono " + ", ruc " + ruc + ", ciudad" + ciudad + super.toString() + '}';}
        }
  */