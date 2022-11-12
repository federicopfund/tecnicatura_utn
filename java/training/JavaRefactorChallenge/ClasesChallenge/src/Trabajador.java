// Heredamos los atributos de la clase persona, y creamos una nueva clase trabajador
// con una nueva variable salario con sus respectivos metodos para recuperar los valores
// y para actualizar los valores
class Trabajador extends Persona{
   // atributo 
    private int salario;
    // metodo set
    public void setSalario(int salario){
        this.salario = salario;
    }
    // metodo get
    public int getSalario() {
        return this.salario;
    }
}