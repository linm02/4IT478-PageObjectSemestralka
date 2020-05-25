package cz.churchcrm.testframework;

public class GridRow {

    public void shouldContain(String record) {


        throw new RuntimeException("record with " + record + "not found");
    }
}
