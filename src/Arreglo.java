public class Arreglo {

    private Personaje[] listado;
    public Arreglo(){
        listado= new Personaje[6];
        ingresar();
    }

    private void ingresar(){
        listado[0]=new Personaje(1, "Batman", 300.45f);
        listado[1]=new Personaje(2, "Peso Pluma", 30.5f);
        listado[2]=new Personaje(3, "Pepe grillo", 35f);
        listado[3]=new Personaje(4, "Pinocho", 45f);
        listado[4]=new Personaje(5, "Dora", 45.5f);
        listado[5]=new Personaje(6, "Bob", 3.45f);
    }
    //Metodo recursivo
    private void imprimir(int indice){
        if(indice< listado.length){
            //Imprimir en orden creciente
            //System.out.println(listado[indice].toString());
            //imprimir(indice+1);

            //Imprimir en orden decreciente
           imprimir(indice+1);
           System.out.println(listado[indice].toString());

        }
    }
    public void imprimir(){
        imprimir(0);
    }

    public float sumar( int indice){
        if(indice< listado.length){

            return listado[indice].getPrecio()+sumar(indice+1);
        }
        return 0;
    }

}
