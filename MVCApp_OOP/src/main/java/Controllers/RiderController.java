package Controllers;
import Models.Rider;
import Models.Rider.Record;
        
public class RiderController {
    
    Rider objRider;
    Rider.Record objRec;
    public Rider addRider(String Name, String Country, int Age, double Weight, double Height)
    {
        objRider=new Rider(Name,Country,Age,Weight,Height);
        return objRider;
    }    
    public Rider.Record addRecord(int No_Of_Olympic_Medals,double TopSpeed, int No_National_Level_Records)
    {
        objRec=objRider.new Record(No_Of_Olympic_Medals,TopSpeed,No_National_Level_Records);
        return objRec;
    }
}
