package DatabaseAccessLayer;
import DatabaseLayer.DatabaseConnection;
import Models.Bicycle;
public class BicycleAccessLogic {

    private DatabaseConnection singleConn;

    public BicycleAccessLogic() {
        singleConn = DatabaseConnection.getSingleInstace();
    }

    public boolean addBicycleTODB(Bicycle bicycle) {
        try {
            String query = "insert into bicycle values(" + bicycle.getGear() + "," + bicycle.getSpeed() + ");";
            boolean result = singleConn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }

}
