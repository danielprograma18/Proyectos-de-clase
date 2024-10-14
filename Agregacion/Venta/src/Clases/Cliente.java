package Clases;

public class Cliente {
    private int codigo;
    private String razonSocial;

    public Cliente () {
    }

        public int getCodigo () {
            return codigo;
        }
            public void setCodigo (int val){
                this.codigo = val;
            }

        public String getRazonSocial (){
            return razonSocial;
        }
            public void setRazonSocial (String val) {
                this.razonSocial = val;
            }
    
            public Cliente(int c, String r){
                setCodigo(c);
                setRazonSocial(r);
                }
}
