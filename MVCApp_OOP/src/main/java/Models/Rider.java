package Models;

public class Rider {

   private String Name;
   private String Country;
   private int Age;
   private double Weight;
   private double Height;

    public class Record {

      private  int No_Of_Olympic_Medals;
      private  double TopSpeed;
      private  int No_National_Level_Records;

        public Record(int No_Of_Olympic_Medals, double TopSpeed, int No_National_Level_Records) {
            this.No_Of_Olympic_Medals = No_Of_Olympic_Medals;
            this.TopSpeed = TopSpeed;
            this.No_National_Level_Records = No_National_Level_Records;
        }

        public String displayDetails() {
            return No_Of_Olympic_Medals + " " + TopSpeed + " " + No_National_Level_Records;
        }
    }

    public double calBMI(double weightm, double heightm) {
        class BMI {

            double WeightMetric;
            double HeightMetric;

            double getBMIMetric() {
                return WeightMetric / HeightMetric * HeightMetric;
            }
        }
        BMI b = new BMI();
        b.WeightMetric = weightm;
        b.HeightMetric = heightm;
        double val = b.getBMIMetric();
        return val;
    }

    public Rider(String Name, String Country, int Age, double Weight, double Height) {
        this.Name = Name;
        this.Country = Country;
        this.Age = Age;
        this.Weight = Weight;
        this.Height = Height;
    }

    public Rider() {
        
    }

    public double getWeight() {
        return Weight;
    }

    public double getHeight() {
        return Height;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }

    public void setHeight(double Height) {
        this.Height = Height;
    }

    public String getName() {
        return Name;
    }

    public String getCountry() {
        return Country;
    }

    public int getAge() {
        return Age;
    }
    
   

}
