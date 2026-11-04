package herancapolimorfismo.introducao;
//Não pode herdar de Employee por causa de seald, mas Manager pode pois esta no permits
public class Client {
    private String document;

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
