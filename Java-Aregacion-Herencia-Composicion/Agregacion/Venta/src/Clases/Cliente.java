package Clases;

public class Cliente {
    private int codigo;
    private String razonSocial;

    public Cliente () {
    }

        public int getCodigo () {
            return codigo;
        }
            public void setCodigo (int codigo){
                this.codigo = codigo;
            }

        public String getRazonSocial (){
            return razonSocial;
        }
            public void setRazonSocial (String razonSocial) {
                this.razonSocial = razonSocial;
            }
    
            public Cliente(int c, String r){
                setCodigo(c);
                setRazonSocial(r);
                }
}
